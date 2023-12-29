package tech.edwyn.hibernatesql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tech.edwyn.hibernatesql.entity.cache.BlogPostCache;
import tech.edwyn.hibernatesql.entity.lazy.BlogPostLazy;

import java.util.List;
import java.util.Optional;

public interface BlogPostCacheRepository extends JpaRepository<BlogPostCache, Long> {

}
