package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog")
public class Blog{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    private int id;                               
    @Column (name = "name")
    private String name;
    @Column(name ="title")
    private String title;
    @Column(name ="review")
    private String review;
    @Column(name="ratings")
    private String ratings;
    @Column(name="contact")
    private String contact;
   
    public Blog(int id,String name,String title,String review,String ratings,String contact){
        this.id=id;
        this.name=name;
        this.title=title;
        this.review=review;
        this.ratings=ratings;
        this.contact=contact;
        
    }

    public Blog(){
       
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    
    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }


    public String getContact() {
        return contact;
    }

    public void Contact(String contact) {
        this.contact = contact;
    }

  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}