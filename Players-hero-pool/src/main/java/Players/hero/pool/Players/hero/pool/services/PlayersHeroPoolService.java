package Players.hero.pool.Players.hero.pool.services;

import Players.hero.pool.Players.hero.pool.dto.Ability;
import Players.hero.pool.Players.hero.pool.dto.Hero;
import Players.hero.pool.Players.hero.pool.dto.Player;

import java.util.List;

public interface PlayersHeroPoolService {
    public void saveAllPlayers();
    public void saveAllHeroes();
    public void savAllAbilities();
    public List<Player> getAllPlayers();
    public Player getPlayerByName(String name);
    public Player getPlayerByNickname(String nickname);
    public List<Hero> getAllHeroes();
    public Hero getHeroByName(String name);
    public List<Ability> getAllAbilities();
    public Ability getAbilityByName(String name);
    public List<Hero> getPlayersHeroPoolByName(String name);
    public List<Player> getHeroPlayersByName(String name);
    public List<Ability> getHeroAbilitiesByName(String name);

}
