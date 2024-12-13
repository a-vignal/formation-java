package com.azqore.blog;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="TEXTE")
    private String texte;

    public Comment(int id, String description, Post post) {
        this.id = id;
        this.texte = description;
        this.post = post;
    }
    public Comment(int id, String description) {
        this.id = id;
        this.texte = description;
    }
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return texte;
    }

    public Post getPost() {
        return post;
    }

    public void setDescription(String description) {
        this.texte = description;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public void setId(int id) {
        this.id = id;
    }
}
