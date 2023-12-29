package tech.edwyn.hibernatesql.entity.lazy;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "blog_posts")
@Getter
public class BlogPostLazy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    private String title;

    private String content;

    @OneToMany(mappedBy = "blogPost")
    private List<CommentLazy> comments = new ArrayList<>();

}

