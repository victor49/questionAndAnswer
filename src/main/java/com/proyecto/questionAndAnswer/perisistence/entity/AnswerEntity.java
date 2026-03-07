package com.proyecto.questionAndAnswer.perisistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answers")
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnswers;

    @Column(nullable = false)
    private String contentAnswer;

    @ManyToOne
    @JoinColumn(name = "idPublication", insertable=false, updatable=false)
    private PublicationEntity publication;

    @ManyToOne
    @JoinColumn(name = "idUser", insertable=false, updatable=false)
    private UserEntity user;


    //Getters and Setters
    public Integer getIdAnswers() {
        return idAnswers;
    }

    public void setIdAnswers(Integer idAnswers) {
        this.idAnswers = idAnswers;
    }

    public String getContentAnswer() {
        return contentAnswer;
    }

    public void setContentAnswer(String contentAnswer) {
        this.contentAnswer = contentAnswer;
    }

    public PublicationEntity getPublication() {
        return publication;
    }

    public void setPublication(PublicationEntity publication) {
        this.publication = publication;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
   }
