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
@Table(name = "Users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdUser;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String LastName;

    @Column(nullable = false)
    private String Age;

    @Column(nullable = false)
    private String IdRole;


    @ManyToOne //muchos User -> un Role
    @JoinColumn(name = "IdRole")
    private RoleEntity role;

    @OneToMany(mappedBy = "user")
    private List<PublicationEntity> publications;


    

    public Integer getIdUser() {
        return IdUser;
    }

    public void setIdUser(Integer idUser) {
        IdUser = idUser;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getIdRole() {
        return IdRole;
    }

    public void setIdRole(String idRole) {
        IdRole = idRole;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public List<PublicationEntity> getPublications() {
        return publications;
    }

    public void setPublications(List<PublicationEntity> publications) {
        this.publications = publications;
    }


    
}
