package main;

public class Dz1 {
	public static double wynik;
	
	public static void oblicz() {
		double q=Frame.getvalue(0);
		double d=Frame.getvalue(1);
		double ps=Frame.getvalue(2);
		
		double x1 = 4*q;
		double x2 = Math.PI * ps;
		double d01 = (d + 0.003);
		double x3 = d01*d01;
		wynik = Math.sqrt((x1/x2)+x3);
		
		System.out.println(q + " "+ d+" " + ps + "  " + x1 + " "+ x2 + " " +x3);
		System.out.println(wynik*1000);
	}
	
	public static double get() {
		return wynik*1000;
	}
}
