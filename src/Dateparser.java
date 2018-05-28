import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Dateparser {
    public static void main(String[] args) throws Exception {

        String time = "2018-02-27T03:00:00";
       /////System.out.println(time.split("T")[1]);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        String duration = "PT900S";
        int value = Integer.parseInt(duration.replaceAll("[^0-9]", ""));

        // 1) create a java calendar instance
        Calendar calendar = Calendar.getInstance();
        Date time1 = format.parse(time);
        System.out.println("utc --" + time1.getTime());
        System.out.println("timezone is ----" + TimeZone.getTimeZone(time).toString());
// 2) get a java.util.Date from the calendar instance.
//    this date will represent the current instant, or "now"
        java.util.Date now = calendar.getTime();

// 3) a java current time (now) instance
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());

        System.out.println("currentTimestamp-----" + currentTimestamp);
        System.out.println("instant-----" + Instant.now().toString());
        Instant instant = Instant.now();

//        System.out.println("instant time-----"+ Instant.parse("2018-02-27T03:00:00-05:00"));


        //System.out.println(format.parse(time));
        /*time = time.split("T")[1];
        Integer quartor= Integer.parseInt(time.split(":")[0])*4 +Integer.parseInt(time.split(":")[1])/15;
        System.out.println("quarter   "+quartor);*/
    }
}
