package Players.hero.pool.Players.hero.pool.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "abilities")
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description", length = 4000)
    private String description;
    @Column(name = "mana_cost")
    private int manaCost;
    @Column(name = "cool_down")
    private int coolDown;
    private enum DamageType {PHYSICAL, MAGICAL, PURE}
    @Column(name = "damage_type")
    private DamageType damageType;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "hero_id")
    private Hero hero;

    public static AbilityBuilder abilityBuilder() {
        return new Ability().new AbilityBuilder();
    }

    public class AbilityBuilder {
        public AbilityBuilder id(long id) {
            Ability.this.id = id;
            return this;
        }

        public AbilityBuilder name(String name) {
            Ability.this.name = name;
            return this;
        }

        public AbilityBuilder description(String description) {
            Ability.this.description = description;
            return this;
        }

        public AbilityBuilder manaCost(int manaCost) {
            Ability.this.manaCost = manaCost;
            return this;
        }

        public AbilityBuilder coolDown(int coolDown) {
            Ability.this.coolDown = coolDown;
            return this;
        }

        public AbilityBuilder damageType(String damageType) {
            Ability.this.damageType = Ability.DamageType.valueOf(damageType);
            return this;
        }

        public Ability build() {
            return Ability.this;
        }

    }


}
