package resistencia;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese resistencia 1 :");
		double resist1 = sc.nextDouble();

		System.out.println("Ingrese resistencia 2 :");
		double resist2 = sc.nextDouble();

		System.out.println("Ingrese resistencia 3 :");
		double resist3 = sc.nextDouble();

		if (resist1 <= 0 || resist2 <= 0 || resist3 <= 0) {

			System.out.println("Las resistencias no son distintas a cero");

		}

		else {

			double RT = (1/resist1+1/resist2+1/resist3);
			RT=1/RT;
			
			System.out.println("La resistencia total es " + RT);

		}
		sc.close();
		
	}	

}
	
