package tech.edwyn.hibernatesql;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.edwyn.hibernatesql.entity.batch.BlogPostBatch;
import tech.edwyn.hibernatesql.entity.cache.BlogPostCache;
import tech.edwyn.hibernatesql.entity.entitygraph.BlogPostEntityGraph;
import tech.edwyn.hibernatesql.entity.lazy.BlogPostLazy;
import tech.edwyn.hibernatesql.entity.subselect.BlogPostSubselect;
import tech.edwyn.hibernatesql.repository.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlogController {

    private final BlogPostRepository blogPostRepository;
    private final BlogPostBatchRepository blogPostBatchRepository;
    private final BlogPostSubselectRepository blogPostSubselectRepository;
    private final BlogPostEntityGraphRepository blogPostEntityGraphRepository;
    private final BlogPostCacheRepository blogPostCacheRepository;

    @GetMapping("/blog-posts")
    public List<BlogPostLazy> getPosts() {
        return blogPostRepository.findAll();
    }

    @GetMapping("/batch/blog-posts")
    public List<BlogPostBatch> getPostsBatch() {
        return blogPostBatchRepository.findAll();
    }

    @GetMapping("/join-fetch/blog-posts")
    public List<BlogPostLazy> getPostsJoinFetch() {
        return blogPostRepository.findAllJoinFetch();
    }

    @GetMapping("/subselect/blog-posts")
    public List<BlogPostSubselect> getPostsSubselect() {
        return blogPostSubselectRepository.findAll();
    }

    @GetMapping("/entity-graph/blog-posts")
    public List<BlogPostEntityGraph> getPostsEntityGraph() {
        return blogPostEntityGraphRepository.findAllByPostIdIn(List.of(1L, 2L, 3L));
    }


    @GetMapping("/cache/blog-posts")
    public List<BlogPostCache> getPostsCache() {
        return blogPostCacheRepository.findAll();
    }

}
