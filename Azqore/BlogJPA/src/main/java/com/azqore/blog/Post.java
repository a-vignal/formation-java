package com.azqore.blog;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Scanner;

@Entity
@Table(name="posts")
public class Post implements Serializable {
    public Post(int id, LocalDate creationDate, String name, String description, List<Comment> comments) {
        this.id = id;
        this.creationDate = creationDate;
        this.name = name;
        this.description = description;
        this.comments = comments;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
        private int id;
    @Column(name="DATE_CREA")
        private LocalDate creationDate;
    @Column(name="NAME")
        private String name;
    @Column(name="DESCRIPTION")
        private String description;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;

   // ... constructor ...
    public Post(int id, LocalDate creationDate, String name, String description){
            this.id = id; /** default constructor **/this.creationDate = creationDate;
            this.name = name;
            this.description = description;
        }

    // ... setters and getters ...
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static Post NewPost(){
        Post newpost = new Post(0, LocalDate.now()," "," ");
        System.out.println("Enter name and description:");
        Scanner myObj = new Scanner(System.in);
        // String input
        newpost.name = myObj.nextLine();
        System.out.println("name post: " + newpost.name);
        newpost.description = myObj.nextLine();
        newpost.creationDate = LocalDate.now();

        return newpost;
    }


}
