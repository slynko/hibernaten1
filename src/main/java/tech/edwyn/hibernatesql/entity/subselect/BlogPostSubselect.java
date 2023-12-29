package tech.edwyn.hibernatesql.entity.subselect;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import tech.edwyn.hibernatesql.entity.batch.CommentBatch;
import tech.edwyn.hibernatesql.entity.lazy.CommentLazy;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "blog_posts")
@Getter
public class BlogPostSubselect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    private String title;

    private String content;

    @OneToMany(mappedBy = "blogPost")
    @Fetch(FetchMode.SUBSELECT)
    private List<CommentLazy> comments = new ArrayList<>();

}

