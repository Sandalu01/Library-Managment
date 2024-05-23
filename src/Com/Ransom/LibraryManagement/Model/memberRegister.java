package Com.Ransom.LibraryManagement.Model;

public class memberRegister {
    private  String Firstname;
    private  String Lastname;
    private  String Email;
    private  String Password;


    public memberRegister() {
    }

    public memberRegister(String firstname, String lastname, String email, String password) {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.Email = email;
        this.Password = password;
    }



    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
 //developer purpose
    @Override
    public String toString() {
        return "memberRegister{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }


}
