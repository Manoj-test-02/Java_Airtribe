package com.airtribe.meditrack.entity;

public class Doctor extends Person{
    private String regNo;
    private Speciality speciality;

    public Doctor(int id, String firstName, String lastName, String mailId, String phoneNo, String regNo, Speciality speciality){
        super(id,firstName,lastName,mailId,phoneNo);
        this.regNo = regNo;
        this.speciality = speciality;
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

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor: " +
                "DoctorId=" + getId() +
                ", Doctor firstName='" + getFirstName() + '\'' +
                ", Doctor lastName='" + getLastName() + '\'' +
                ", Doctor mailId='" + getMailId() + '\'' +
                ", Doctor phoneNo='" + getPhoneNo() + '\'' +
                ", Reg No ='" + getRegNo() + '\'' +
                ", Speciality='" + getSpeciality();
    }
}
