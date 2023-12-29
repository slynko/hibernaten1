package tech.edwyn.hibernatesql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tech.edwyn.hibernatesql.entity.lazy.BlogPostLazy;

import java.util.List;
import java.util.Optional;

public interface BlogPostRepository extends JpaRepository<BlogPostLazy, Long> {
    @Query("SELECT p FROM BlogPostLazy p JOIN FETCH p.comments")
    List<BlogPostLazy> findAllJoinFetch();
}
