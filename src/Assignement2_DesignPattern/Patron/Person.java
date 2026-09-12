package Assignement2_DesignPattern.Patron;

public class Person  {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String emailId;
    private final String mobileNo;

    public Person(int id, String firstName, String lastName, String emailId,String mobileNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }
}
