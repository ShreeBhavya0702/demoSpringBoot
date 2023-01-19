package com.exampleJava.demoSpringBoot.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    public Teacher(String first,String last){
        this.firstName=first;
        this.lastName=last;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return lastName;
    }

    public void setSecondName(String secondName) {
        this.lastName = secondName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
