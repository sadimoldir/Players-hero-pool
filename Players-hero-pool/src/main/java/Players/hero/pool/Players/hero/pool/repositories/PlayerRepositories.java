package Players.hero.pool.Players.hero.pool.repositories;

import Players.hero.pool.Players.hero.pool.dto.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepositories extends CrudRepository< Player,Long>{
}
