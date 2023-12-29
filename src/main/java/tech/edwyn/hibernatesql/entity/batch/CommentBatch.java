package tech.edwyn.hibernatesql.entity.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import tech.edwyn.hibernatesql.entity.batch.BlogPostBatch;

@Entity
@Table(name = "comments")
@Getter
public class CommentBatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    @JsonIgnore
    private BlogPostBatch blogPost;
}