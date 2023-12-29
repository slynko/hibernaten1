package tech.edwyn.hibernatesql.entity.batch;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.BatchSize;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "blog_posts")
@Getter
public class BlogPostBatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    private String title;

    private String content;

    @OneToMany(mappedBy = "blogPost")
    @BatchSize(size = 10)
    private List<CommentBatch> comments = new ArrayList<>();

}

