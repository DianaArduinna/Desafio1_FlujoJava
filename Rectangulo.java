package rectangulo;

import java.util.Scanner;

public class Rectangulo {
	private static Scanner sc;

	// Diana Jimenez

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.printf("Ingrese alto del rectangulo\n");
		int h = sc.nextInt();
		System.out.printf("Ingrese largo del rectangulo\n");
		int b = sc.nextInt();
		System.out.printf("Ingrese alto del subrectangulo\n");
		float hx = sc.nextFloat();
		System.out.printf("Ingrese largo del subrectangulo\n");
		float bx = sc.nextFloat();

		int area = (b * h);
		int perimetro = (2 * (b + h));
		System.out.println("El area del rectangulo es :" + area);
		System.out.println("El perimetro del rectangulo es :" + perimetro);

		// subrectangulo
		if (hx < h || bx < b) {
			float areax = (bx * hx);
			float perimx = (2 * (bx + hx));

			System.out.println("El area del subrectangulo es :" + areax);
			System.out.println("El perimetro del subrectangulo es :" + perimx);
		} else
			System.out.println("no se puede calcular la nueva area y perimetro");

		sc.close();
	}

}
