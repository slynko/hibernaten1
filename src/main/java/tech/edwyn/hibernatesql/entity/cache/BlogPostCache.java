package tech.edwyn.hibernatesql.entity.cache;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "blog_posts")
@Getter
@Cacheable
public class BlogPostCache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    private String title;

    private String content;

    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @OneToMany(mappedBy = "blogPost")
    private List<CommentCache> comments = new ArrayList<>();

}

