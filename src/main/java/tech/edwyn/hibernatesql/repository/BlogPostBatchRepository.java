package tech.edwyn.hibernatesql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.edwyn.hibernatesql.entity.batch.BlogPostBatch;

import java.util.Optional;

public interface BlogPostBatchRepository extends JpaRepository<BlogPostBatch, Long> {
}
