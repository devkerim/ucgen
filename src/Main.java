import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Scanner intscanner = new Scanner(System.in);
    int a,b,c,u;
    double alan;


	System.out.print("1. çevrenin uzunluğunu giriniz: ");
	a = intscanner.nextInt();
	System.out.print("2. çevrenin uzunluğunu giriniz: ");
	b = intscanner.nextInt();
	System.out.print("3. çevrenin uzunluğunu giriniz: ");
	c = intscanner.nextInt();
	u=(a+b+c)/2;
	alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
	System.out.println("Üçgenin çevresi: "+2*u);
	System.out.println("Üçgenin Alanı: "+alan);





    }
}
