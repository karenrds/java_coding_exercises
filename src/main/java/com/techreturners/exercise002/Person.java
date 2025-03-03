package com.techreturners.exercise002;

public class Person {
    private String firstname;
    private String lastname;
    private String city;
    private Integer age;

    public Person(String firstname, String lastname, String city, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }
    
}
