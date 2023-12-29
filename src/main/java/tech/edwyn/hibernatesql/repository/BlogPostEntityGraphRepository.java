package tech.edwyn.hibernatesql.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.edwyn.hibernatesql.entity.entitygraph.BlogPostEntityGraph;

import java.util.List;

public interface BlogPostEntityGraphRepository extends JpaRepository<BlogPostEntityGraph, Long> {
    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, value = "blog_post_comments_graph")
    List<BlogPostEntityGraph> findAllByPostIdIn(List<Long> postIds);
}
