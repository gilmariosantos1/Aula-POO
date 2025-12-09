package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add(0,"BMW");
		cars.add(1,"Ford");
		cars.add(2,"Mazda");
		System.out.println(cars);

	}

}
