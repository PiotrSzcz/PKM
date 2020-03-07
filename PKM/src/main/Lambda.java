package main;

public class Lambda {
	static double wynik;
	static double de;
	
	public static void oblicz(){
		double lp =Frame.getvalue(0);
		double d =Frame.getvalue(1);
		double q =Frame.getvalue(2);
		double nw =Frame.getvalue(3);
		double e =Frame.getvalue(4);
		wynik = (8*lp)/d;
		
		double x11 = 256*q*nw*lp*lp;
		double x12 = Math.PI*Math.PI*e;
		double x13 = x11/x12;
		de = Math.pow(x13, 0.25);
		
	}

	public static double de() {
		return de*1000;
	}
	
	public static double get() {
		return wynik;
	}
}
