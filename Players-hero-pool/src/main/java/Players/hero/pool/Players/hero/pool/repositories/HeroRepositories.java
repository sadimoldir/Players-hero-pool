package Players.hero.pool.Players.hero.pool.repositories;
import Players.hero.pool.Players.hero.pool.dto.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepositories extends CrudRepository<Hero, Long> {
}
