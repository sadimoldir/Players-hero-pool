package Players.hero.pool.Players.hero.pool.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "heroes")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "description", length = 4000)
    String description;
    @Column(name = "health")
    int health;
    @Column(name = "mana")
    int mana;
    enum MainAttribute {STRENGTH, AGGRESSION, INTELLIGENCE, UNIVERSAL}
    @Column(name = "main_attribute")
    MainAttribute mainAttribute;
    @OneToMany(cascade = CascadeType.ALL
               ,mappedBy = "hero")
    List<Ability> abilities = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable ( name = "player_pools"
            ,joinColumns = @JoinColumn (name = "hero_id")
            ,inverseJoinColumns = @JoinColumn(name = "player_id"))
    List<Player> players = new ArrayList<>();

    public static HeroBuilder heroBuilder() {
        return new Hero().new HeroBuilder();
    }

    public class HeroBuilder {
        public HeroBuilder id(Long id) {
            Hero.this.id = id;
            return this;
        }

        public HeroBuilder name(String name) {
            Hero.this.name = name;
            return this;
        }

        public HeroBuilder description(String description) {
            Hero.this.description = description;
            return this;
        }

        public HeroBuilder health(int health) {
            Hero.this.health = health;
            return this;
        }

        public HeroBuilder mana(int mana) {
            Hero.this.mana = mana;
            return this;
        }

        public HeroBuilder mainAttribute(String mainAttribute) {
            Hero.this.mainAttribute = Hero.MainAttribute.valueOf(mainAttribute);
            return this;
        }

       public HeroBuilder heroAbilities(List<Ability> abilities ) {
            Hero.this.abilities=abilities;
            for(Ability a:abilities)
                a.setHero(Hero.this);
            return this;
        }
        public HeroBuilder heroPlayers(List<Player> players ) {
            Hero.this.players=players;
            return this;
        }

        public Hero build() {
            return Hero.this;
        }

    }

}
