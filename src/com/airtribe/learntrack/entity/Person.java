package com.airtribe.learntrack.entity;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;

    Person (int id, String firstname, String lastname, String emailid){
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.emailId = emailid;
    }
    Person (int id, String firstname, String lastname) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstName(){
        return firstName;
    }
    public int getid() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }
}
