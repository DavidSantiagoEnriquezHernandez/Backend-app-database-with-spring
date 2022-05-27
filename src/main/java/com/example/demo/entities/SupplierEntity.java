package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "supplier_name", columnDefinition = "varchar (20)", nullable = false)
    private String supplierName;
    @Column(name = "Origin", columnDefinition = "varchar (60)", nullable = false)
    private String origin;
    @Column(name = "Address", columnDefinition = "varchar (60)", nullable = false)
    private String address;

    public SupplierEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String company) {
        this.supplierName = company;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
















