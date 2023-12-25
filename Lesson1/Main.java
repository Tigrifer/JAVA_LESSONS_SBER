package Lesson1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		// System.out.println("Child: no-name. ============== .");
		// Child c1 = new Child();

		// System.out.println("");
		// System.out.println("");
		// System.out.println("");

		// System.out.println("Child: no-name2. ============== .");
		// Child c_2 = new Child();

		// System.out.println("");
		// System.out.println("");
		// System.out.println("");
		// System.out.println("Child: Ivan. ============== .");
		Child c2 = new Child("Ivan");
		Child c3 = new Child("Ivan");

		HashMap<Child, String> hm = new HashMap<Child, String>();

		hm.put(c2, "1");
		hm.put(c3, "2");
		System.out.println(hm);
	}
}
