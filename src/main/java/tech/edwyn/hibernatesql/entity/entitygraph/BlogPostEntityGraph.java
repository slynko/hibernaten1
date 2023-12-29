package tech.edwyn.hibernatesql.entity.entitygraph;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.BatchSize;
import tech.edwyn.hibernatesql.entity.batch.CommentBatch;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "blog_posts")
@Getter
@NamedEntityGraph(name = "blog_post_comments_graph", attributeNodes = @NamedAttributeNode("comments"))
public class BlogPostEntityGraph {

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

