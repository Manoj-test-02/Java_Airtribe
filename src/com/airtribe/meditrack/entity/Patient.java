package com.airtribe.meditrack.entity;

public class Patient extends Person{

    private String existingDisease;

    public Patient(int id, String firstName, String lastName, String mailId, String phoneNo, String existingDisease) {
        super(id, firstName, lastName, mailId, phoneNo);
        this.existingDisease = existingDisease;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getMailId() {
        return super.getMailId();
    }

    @Override
    public void setMailId(String mailId) {
       super.setMailId(mailId);
    }

    @Override
    public String getPhoneNo() {
        return super.getPhoneNo();
    }

    @Override
    public void setPhoneNo(String phoneNo) {
        super.setPhoneNo(phoneNo);
    }

    public String getExistingDisease() {
        return existingDisease;
    }

    public void setExistingDisease(String existingDisease) {
        this.existingDisease = existingDisease;
    }

    @Override
    public String toString() {
        return "Patient: " +
                "PatientId=" + getId() +
                ", Patient firstName='" + getFirstName() + '\'' +
                ", Patient lastName='" + getLastName() + '\'' +
                ", Patient mailId='" + getMailId() + '\'' +
                ", Patient phoneNo='" + getPhoneNo() + '\'' +
                ", Existing Disease='" + getExistingDisease();
    }


}
