package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("Name:");
		String name = sc.next();
		
		System.out.println("email");
		String email = sc.next();

		System.out.println("Birth Date (DD/MM/YYY)");
		 Date data = sdf.parse(sc.next());

		 Client c1 = new Client(name, email, data);
		 System.out.println(c1);
	}

}
