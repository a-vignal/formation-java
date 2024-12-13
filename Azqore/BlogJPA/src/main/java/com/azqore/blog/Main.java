package com.azqore.blog;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("/--------------- EntityManagerFactory -------------/");
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("persistence-unit");
        System.out.println("/------------------ EntityManager ----------------/");
        EntityManager em = emf.createEntityManager();
        System.out.println("/------------------ persist ----------------/");
        //--
        em.getTransaction().begin();
        /*em.persist(new Post(0, LocalDate.of(2024, Month.NOVEMBER,11),"test1","desc test1") );
        em.persist(new Post(0, LocalDate.of(2024, Month.NOVEMBER,11),"test2","desc test2") );
        em.persist(new Post(0, LocalDate.of(2024, Month.NOVEMBER,11),"test3","desc test3") );*/

        Post newpost = new Post(0, LocalDate.now()," "," ");
        String reponse = "O";
        Scanner scanner = new Scanner(System.in);

        while (reponse.contentEquals("O"))
        {
            System.out.println("Saisie d'un post (O/N): ");
            reponse = scanner.nextLine();
            if (reponse.contentEquals("O")) {
                newpost = Post.NewPost();
                Comment comment = new Comment(0,"commentaire 1");
                List list = new ArrayList<>();
                list.add(comment);
                newpost.setComments(list );
                em.persist(newpost);
            }
        }

        Query query = em.createQuery("SELECT * FROM Post AS s");
        List<Post> list = query.getResultList();
        System.out.println("liste des Posts, pour commenter, saisie le numero de post puis le commentaire: ");
        System.out.println(list);
        System.out.println("Pour commenter, saisir le numero  de post (Enter) puis le commentaire: ");
        Comment comment2 = new Comment(0,"");
        int idPost;
        idPost = scanner.nextInt();
        comment2.setDescription(scanner.nextLine());
        Query query2 = em.createQuery("SELECT * FROM Post where id = :id");
        query2.setParameter("id", 5);
        List<Post> list2 = query2.getResultList();

        em.persist(new Comment(0,comment2.toString(),list2.get(0)));

        em.getTransaction().commit();

        //-- FIN
        em.close();
        emf.close();
    }
}