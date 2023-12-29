package tech.edwyn.hibernatesql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tech.edwyn.hibernatesql.entity.lazy.BlogPostLazy;
import tech.edwyn.hibernatesql.entity.subselect.BlogPostSubselect;

import java.util.List;
import java.util.Optional;

public interface BlogPostSubselectRepository extends JpaRepository<BlogPostSubselect, Long> {
}
