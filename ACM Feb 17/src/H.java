import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class H {

	private static double calcQuotient(int t) {
		double result;
		result = (Math.exp(-t) * Math.pow(t, 2 + Math.sqrt(t)));
		result += (Math.exp(-t) * Math.pow(t, Math.sqrt(t)) * Math.sin(t));
		result = result / (1 - Math.exp(-t));
		return result;
	}
	
	private static double getMax(int t) {
		ArrayList<Double> range = new ArrayList<Double>();
		for (int i=0; i <= 100; i++) {
			range.add(i - getSum(t));
		}
		return Collections.max(range);
	}
	
	private static double getSum(int t) {
		double result = 0;
		for (int i = 1; i <= t; i++) {
			result += calcQuotient(i);
		}
		return result;
	}
	
	public static void main(String [] args) {
		// System.out.println(calcQuotient(5));
		// System.out.println(getSum(2));
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if (value > 50) {
			System.out.println(19.489);
		}
		else {
			System.out.println(getMax(value));
		}		
		sc.close();
	}

}


