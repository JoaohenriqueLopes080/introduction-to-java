// importing 3 types for data, style and locale.
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Manipulation {

    public static void main(String[] args) {

        // In this area we are doing manipulation of strings and datas

        // example
        String name = "Jesse";

        // to Upper case

        System.out.println(name.toUpperCase());
        // to lower case

        System.out.println(name.toLowerCase());
        // length of the variable
        System.out.println((name.length()));

        String OtherName = "jesse";
        System.out.println(name.equalsIgnoreCase(OtherName));

        // hello, {name}, today is {day of the weekend}, good day
        // localdate = date of the place you are
        LocalDate today = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(today);
        // new choose a day of the week
        System.out.println(today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String dayofweek= today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.printf("Hello, %s, today is %s, good day", name, dayofweek);

        System.out.printf("%n");
        // new a variable to get the local date time
        LocalDateTime now = LocalDateTime.now();
        String salute;
        // choosing which text to appear according to the time
        if (now.getHour() < 12) {
            salute = "Good Morning";
        } else if (now.getHour() < 18) {
            salute = "Good Afternoon";
        } else {
            salute = "Good Evening";
        }
        System.out.printf("%s, %s, today is %s, good day",salute, name, dayofweek);
    }
}
