package main;

public class N {
	public static double wynik;
	
	public static void oblicz() {
		double q = Frame.getvalue(0);
		double d = Frame.getvalue(1);
		double d1 = Frame.getvalue(2);
		double pruch = Frame.getvalue(3);
		
		double x1 = 4*q;
		double x2 = Math.PI*pruch*((d*d)-(d1*d1));
		wynik = x1/x2;
		System.out.println(wynik);
	}
	public static double get() {
		return wynik;
	}
}
