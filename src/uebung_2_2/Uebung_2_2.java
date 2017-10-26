package uebung_2_2;

public class Uebung_2_2 {

	public static void main(String[] args) {
		double a = 8;
		double b = 3;
		
		double aufDerLinkenSeite = ((a + b)*(a + b));
		double aufDerRechtenSeite = (a*a + 2*a*b + b*b);
		
		double loesung1 = aufDerLinkenSeite;
		double loesung2 = aufDerRechtenSeite;
		
		System.out.println("x1 = " + loesung1);
		System.out.println("x2 = " + loesung2);
		

	}

}
