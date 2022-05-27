package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CostumerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "user_seq_gen")
    @SequenceGenerator(name="user_seq_gen", sequenceName = "user_id_seq" , allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "country", columnDefinition = "varchar (20)", nullable = false)
    private String country;
    @Column(name = "first_name", columnDefinition = "varchar (60)", nullable = false)
    private String firstName;
    @Column(name = "last_name", columnDefinition = "varchar (60)", nullable = false)
    private String lastName;

    public CostumerEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country ) {
        this.country= country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
