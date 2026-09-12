package Assignement2_DesignPattern.Patron;

public class Admin extends Person{

    public Admin(int id, String firstName, String lastName, String mailId, String mobileNo){
        super(id,firstName, lastName, mailId, mobileNo);
    }

    public String getAdminfirstName(){
        return super.getFirstName();
    }

    public String getAdminlastName(){
        return super.getLastName();
    }

    public String getAdminMail(){
        return super.getEmailId();
    }

    public String getAdminMobile(){
        return super.getMobileNo();
    }

    @Override
    public String toString() {
        return "Admin: "+
                "Name: " + getAdminfirstName() +
                ", Last Name: " +getAdminlastName() +
                ", Email Id: " +getAdminMail() +
                ", Mobile No: " +getAdminMobile()
                ;
    }
}
