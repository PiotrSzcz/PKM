package main;


public class D3 {
	public static double nw = Frame.getvalue(3);
	public static double r1 = Frame.getvalue(5);
	public static double r0 =Frame.getvalue(4);
	public static double q=Frame.getvalue(0);
	public static double lp=Frame.getvalue(2);
	public static double delth=Frame.getvalue(1);
	public static double wynik;
	
	public static void oblicz() {
		double nw = Frame.getvalue(3);
		double r1 = Frame.getvalue(5);
		double r0 =Frame.getvalue(4);
		double q=Frame.getvalue(0);
		double lp=Frame.getvalue(2);
		double delth=Frame.getvalue(1);
		
		double x2 = 8*Math.PI*r1*lp;
		double x3 = x2*x2;
		double x4 = 16*Math.PI*r0*q*nw;
		double x5 = 2*Math.PI*r0;
		double x6 = Math.sqrt(x3+x4);
		double wynik = (x2+x6)/x5;
		
		System.out.println("Podstawione dane Q= "+q + " H= "+delth+" Lp= "+lp+ "Nw= "+nw+" R0 = "+r0+" R1= "+r1);
		System.out.println("Wynike: "+wynik*100 +" mm");
	}
	
	public static double get() {
		return wynik;
	}

}
