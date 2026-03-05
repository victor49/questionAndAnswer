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
@Table(name = "Answers")
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdAnswers;

    @Column(nullable = false)
    private String Content;

    @ManyToOne
    @JoinColumn(name = "IdPublication")
    private PublicationEntity plication;

    @ManyToOne
    @Column(name = "IdUser")
    private UserEntity user;

    

    public Integer getIdAnswers() {
        return IdAnswers;
    }

    public void setIdAnswers(Integer idAnswers) {
        IdAnswers = idAnswers;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public PublicationEntity getPlication() {
        return plication;
    }

    public void setPlication(PublicationEntity plication) {
        this.plication = plication;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }


    

}
