package com.proyecto.questionAndAnswer.perisistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "publication")
public class PublicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublication;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contentPublication;

    @ManyToOne
    @JoinColumn(name = "idUser", insertable=false, updatable=false)
    private UserEntity user;

    @OneToMany(mappedBy = "publication")
    private List<AnswerEntity> answers;


    //Getters and Setters
    public Integer getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentPublication() {
        return contentPublication;
    }

    public void setContentPublication(String contentPublication) {
        this.contentPublication = contentPublication;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<AnswerEntity> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerEntity> answers) {
        this.answers = answers;
    }



    
}
