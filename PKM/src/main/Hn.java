package main;

public class Hn {
	public static double wynik;
	
	public static void oblicz() {
		double n = N.get();
		double s = Frame.getvalue(0);
		double d1 = Frame.getvalue(1);
		double d = Frame.getvalue(2);
		
		wynik = (1.5+n)*s;
		System.out.print(wynik);
		if(wynik < d1*1000) {
			wynik = 1.3*d;
		}
	}
	public static double get() {
		return wynik*1000;
	}
}
