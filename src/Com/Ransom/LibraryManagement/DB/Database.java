package Com.Ransom.LibraryManagement.DB;

import Com.Ransom.LibraryManagement.Model.Book;
import Com.Ransom.LibraryManagement.Model.Member;
import Com.Ransom.LibraryManagement.Model.memberRegister;
import Com.Ransom.LibraryManagement.Utill.Security.PasswordManager;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Book> booktable=new ArrayList();
    public static ArrayList<Member> memebertable=new ArrayList();
    public static ArrayList<memberRegister> memeberregistertable=new ArrayList();

    static {
     memeberregistertable.add(new memberRegister("Sandalu","Ekanayaka","sandaluthushan20@gmail.com",
             new PasswordManager().encryption("Thush@12213")));

    }

}
