package POJO;

public class CsvUsersWithoutAnnotation {
    private String name;
    private String email;
    private String phoneNo;
    private String country;

    public CsvUsersWithoutAnnotation() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CsvUsersWithoutAnnotation(String name, String email, String phoneNo, String country) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getCountry() {
        return country;
    }

}
