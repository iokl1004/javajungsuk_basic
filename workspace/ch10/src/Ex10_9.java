import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex10_9 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2021�� 12�� 03��");
			System.out.println(df2.format(d));
		} catch( Exception e) {}
	} //main

}
