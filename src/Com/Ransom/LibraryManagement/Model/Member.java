package Com.Ransom.LibraryManagement.Model;

public class Member {
    private String name;
    private String email;
    private String Phone;
    private String Address;
    private String city;

    public Member() {
    }

    public Member(String name, String email, String phone, String address, String city) {
        this.name = name;
        this.email = email;
        this.Phone = phone;
        this.Address = address;
        this.city = city;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
