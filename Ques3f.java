package ashishbhatia;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ques3f {

	public static void main(String[] args) {
		ZonedDateTime currentTime= ZonedDateTime.now();
		ZonedDateTime currentTimeInNewYork =ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(currentTime );
		System.out.println(currentTimeInNewYork);
	}
}
