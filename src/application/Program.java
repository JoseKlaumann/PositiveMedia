//URI - 1064 - 08/08/2021.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calc;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Calc pro = new Calc();
		pro.setRepeat(sc.nextInt());
		
		for (int i = 0; i < pro.getRepeat(); i++) {
			pro.setValues(sc.nextDouble());
			if (pro.getValues() > 0) {
				pro.sum(pro.getValues());
				pro.addCountPositive();
			}
		}
		
		System.out.println(pro);
		
		sc.close();
	}
}