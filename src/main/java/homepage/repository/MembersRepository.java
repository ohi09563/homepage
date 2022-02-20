package homepage.repository;

import homepage.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface MembersRepository extends JpaRepository<Members, Long>, QuerydslPredicateExecutor<Members> {

    @Transactional
    @Query("select i from Members i where i.id = :id")
    List<Members> getMember(@Param("id") String id);
}
