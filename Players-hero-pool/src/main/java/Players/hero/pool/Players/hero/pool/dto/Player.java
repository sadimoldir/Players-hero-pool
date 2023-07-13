package Players.hero.pool.Players.hero.pool.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;
    @Column(name = "name")
    String name;
    @Column(name = "nickname")
    String nickname;
    @Column(name = "team_name")
    String teamName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable ( name = "player_pools"
            ,joinColumns = @JoinColumn (name = "player_id")
            ,inverseJoinColumns = @JoinColumn(name = "hero_id"))
    List<Hero> playerPool;

    public static PlayerBuilder playerBuilder(){ return new Player().new PlayerBuilder();}
    public class PlayerBuilder{
        public PlayerBuilder id(Long id) {
            Player.this.id = id;
            return this;
        }
        public PlayerBuilder name(String name) {
            Player.this.name = name;
            return this;
        }
        public PlayerBuilder nickname(String nickname) {
            Player.this.nickname = nickname;
            return this;
        }
        public PlayerBuilder teamName(String teamName) {
            Player.this.teamName = teamName;
            return this;
        }
        public PlayerBuilder playerPool(List<Hero> playerPool) {
            Player.this.playerPool = playerPool;
            return this;
        }
        public Player build() {
            return Player.this;
        }
    }


}
