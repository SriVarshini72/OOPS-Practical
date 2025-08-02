package example;


	import java.time.*;

	public class ZonedDatetime {
	    public static void main(String[] args) {ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Zoned date and time (India): " + indiaTime);
}
	}
