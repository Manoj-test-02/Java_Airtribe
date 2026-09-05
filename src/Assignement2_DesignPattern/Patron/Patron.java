package Assignement2_DesignPattern.Patron;

public class Patron extends Person {

    private final boolean active;
    private final Subscription subscription;

    public Patron(int id, String firstName, String lastName, String emailId,String mobilenumber, boolean active, Subscription subscription){
        super(id, firstName, lastName, emailId, mobilenumber);
        this.active = active;
        this.subscription = subscription;
    }

    public boolean isActive() {
        return active;
    }

    public Subscription getUserSubscription(){
        return subscription;
    }

    public String getPatronFirstName(){
        return super.getFirstName();
    }

    public String getPatronLastName(){
        return super.getLastName();
    }

    public String getPatronemailID(){
        return super.getEmailId();
    }
    public String getPatronMobile() {return  super.getMobileNo();}

    @Override
    public String toString() {
        return "Patron Details: " +
                "Name: " + getPatronFirstName() +
                ", Last Name: " +getPatronLastName() +
                ", Email Id: " +getPatronemailID() +
                ", Mobile No: " +getPatronMobile() +
                ", subscription=" + getUserSubscription()
                ;
    }
}
