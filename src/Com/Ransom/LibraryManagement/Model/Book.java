package Com.Ransom.LibraryManagement.Model;

public class Book {
    private  String BookId;
    private  String BookName;
    private  String membername;
    private  String Date;
    private String timepieroed;


    public Book() {
    }

    public Book(String bookId, String bookName, String membername, String date, String timepieroed) {
        this.BookId = bookId;
        this.BookName = bookName;
        this.membername = membername;
        this.Date = date;
        this.timepieroed = timepieroed;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTimepieroed() {
        return timepieroed;
    }

    public void setTimepieroed(String timepieroed) {
        this.timepieroed = timepieroed;
    }
    @Override
    public String toString() {
        return "Book{" +
                "BookId='" + BookId + '\'' +
                ", BookName='" + BookName + '\'' +
                ", membername='" + membername + '\'' +
                ", Date='" + Date + '\'' +
                ", timepieroed='" + timepieroed + '\'' +
                '}';
    }
}
