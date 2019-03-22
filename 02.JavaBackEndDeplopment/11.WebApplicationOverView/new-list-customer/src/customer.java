import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class customer {
    private String name;
    private String address;
    private Date dayOfBird;
    private static final DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public customer() {

    }

    public customer(String name, String address, String dayOfBird) {
        this.name = name;
        this.address = address;
        try {
            this.dayOfBird = df.parse(dayOfBird);
        } catch (
                ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDayOfBird() {
        return dayOfBird;
    }

    public void setDayOfBird(Date dayOfBird) {
        this.dayOfBird = dayOfBird;
    }

    public static DateFormat getDf() {
        return df;
    }
}
