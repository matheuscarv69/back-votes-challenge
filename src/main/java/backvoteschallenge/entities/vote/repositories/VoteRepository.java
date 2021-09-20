package backvoteschallenge.entities.vote.repositories;

import backvoteschallenge.entities.vote.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    List<Vote> findAllByOrderId(Long orderId);

}
