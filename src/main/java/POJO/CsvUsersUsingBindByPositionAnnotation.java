package POJO;

import com.opencsv.bean.CsvBindByPosition;

public class CsvUsersUsingBindByPositionAnnotation {
    @CsvBindByPosition(position = 0)
    private String name;

    @CsvBindByPosition(position = 1)
    private String email;

    @CsvBindByPosition(position = 2)
    private String phoneNo;

    @CsvBindByPosition(position = 3)
    private String country;

    // Getters and Setters (Omitted for brevity)

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
