package com.example.demo.entities;
import  javax.persistence.*;

@Entity

public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "company_name", columnDefinition = "varchar (20)", nullable = false)
    private String companyName;
    @Column(name = "name", columnDefinition = "varchar (60)", nullable = false)
    private String name;
    @Column(name = "prize", columnDefinition = "varchar (60)", nullable = false)
    private String prize;

    public ProductEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }
}