package Players.hero.pool.Players.hero.pool.repositories;

import Players.hero.pool.Players.hero.pool.dto.Ability;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepositories extends CrudRepository<Ability,Long> {
}
