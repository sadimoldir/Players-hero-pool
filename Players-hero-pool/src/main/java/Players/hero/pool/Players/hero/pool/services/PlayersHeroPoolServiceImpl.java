package Players.hero.pool.Players.hero.pool.services;

import Players.hero.pool.Players.hero.pool.data.DataImporter;
import Players.hero.pool.Players.hero.pool.dto.Ability;
import Players.hero.pool.Players.hero.pool.dto.Hero;
import Players.hero.pool.Players.hero.pool.dto.Player;
import Players.hero.pool.Players.hero.pool.repositories.AbilityRepositories;
import Players.hero.pool.Players.hero.pool.repositories.HeroRepositories;
import Players.hero.pool.Players.hero.pool.repositories.PlayerRepositories;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlayersHeroPoolServiceImpl implements PlayersHeroPoolService {
    private final AbilityRepositories abilityRepositories;
    private final HeroRepositories heroRepositories;
    private final PlayerRepositories playerRepositories;
    private DataImporter dataImporter= new DataImporter();

    @Autowired
    public PlayersHeroPoolServiceImpl(AbilityRepositories abilityRepositories, HeroRepositories heroRepositories
                                      , PlayerRepositories playerRepositories) {
        this.abilityRepositories = abilityRepositories;
        this.heroRepositories = heroRepositories;
        this.playerRepositories = playerRepositories;
    }

    @PostConstruct
    public void init() {
        savAllAbilities();
        saveAllHeroes();
        saveAllPlayers();
    }
    @Override
    public void savAllAbilities() {
        abilityRepositories.saveAll(dataImporter.getAllAbilities());
    }
    @Override
    public void saveAllHeroes() {
        heroRepositories.saveAll(dataImporter.getAllHeroes());
    }
    @Override
    public void saveAllPlayers() {
        playerRepositories.saveAll(dataImporter.getAllPlayers());
    }

        @Override
    public List<Player> getAllPlayers() {
        return (List<Player>) playerRepositories.findAll();
    }

    @Override
    public Player getPlayerByName(String name) {
        return getAllPlayers().stream().filter(p -> p.getName().equals(name)).findAny().orElse(null);

    }

    @Override
    public Player getPlayerByNickname(String nickname) {
        return  getAllPlayers().stream().filter(p -> p.getNickname().equals(nickname)).findAny().orElse(null);
    }

    @Override
    public List<Hero> getAllHeroes() {
        return (List<Hero>) heroRepositories.findAll();
    }

    @Override
    public Hero getHeroByName(String name) {
        return getAllHeroes().stream().filter(h -> h.getName().equals(name)).findAny().orElse(null);
    }

    @Override
    public List<Ability> getAllAbilities() {
        return (List<Ability>) abilityRepositories.findAll();
    }

    @Override
    public Ability getAbilityByName(String name) {
        return getAllAbilities().stream().filter(h -> h.getName().equals(name)).findAny().orElse(null);
    }

    @Override
    public List<Hero> getPlayersHeroPoolByName(String name) {
        return getPlayerByName(name).getPlayerPool();
    }

    @Override
    public List<Player> getHeroPlayersByName(String name) {
        return getHeroByName(name).getPlayers();
    }

    @Override
    public List<Ability> getHeroAbilitiesByName(String name) {
        return getHeroByName(name).getAbilities();
    }
}
