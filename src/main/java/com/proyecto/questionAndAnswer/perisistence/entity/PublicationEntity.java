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
@Table(name = "Publications")
public class PublicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPublication;

    @Column(nullable = false)
    private String Title;

    @Column(nullable = false)
    private String Content;

    @ManyToOne
    @JoinColumn(name = "IdUser")
    private UserEntity user;

    @OneToMany(mappedBy = "user")
    private List<AnswerEntity> Answers;

    

    public Integer getIdPublication() {
        return IdPublication;
    }

    public void setIdPublication(Integer idPublication) {
        IdPublication = idPublication;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<AnswerEntity> getAnswers() {
        return Answers;
    }

    public void setAnswers(List<AnswerEntity> answers) {
        Answers = answers;
    }

    
    
}
