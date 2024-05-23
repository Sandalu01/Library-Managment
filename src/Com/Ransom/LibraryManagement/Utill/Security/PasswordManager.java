package Com.Ransom.LibraryManagement.Utill.Security;

import org.mindrot.BCrypt;

public class PasswordManager {
    public String encryption(String rowpassword){
        return BCrypt.hashpw(rowpassword,BCrypt.gensalt(10));

    }
    public  boolean chekpassword(String rawpassword,String hashpassword){
        return BCrypt.checkpw(rawpassword, hashpassword);


}
    }
