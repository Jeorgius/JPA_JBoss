//package com.jeorgius.entities;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "address", schema = "userdata")
//@SequenceGenerator(name="h", sequenceName = "userdata.hibernate_sequence")
//public class AddressEntity {
//
//    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "h")
//    private Integer id;
//
//    private String country;
//    private String city;
//
//    @ManyToOne
//    private UserEntity user;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//}
