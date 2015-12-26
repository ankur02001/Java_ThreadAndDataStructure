package hw3;

import java.util.Scanner;

public class GaussianRational 
{
	private Frac nu;
	private Frac de;
	
	GaussianRational()
	{
		nu.setNumerator(1);
		nu.setDenominator(0);
	}
	GaussianRational(Frac a, Frac b)
	{
		nu = a;
		de = b;
	}
	
	GaussianRational(long p, long q, long m, long n)
	{
		nu.setNumerator(p/q);
		de.setDenominator(m/n);	
	}
	
	GaussianRational(GaussianRational g)
	{
		
	}
	
	public GaussianRational add(GaussianRational r)
	{
		GaussianRational g = new GaussianRational();
		g.nu = (this.nu).add(r.nu);
		g.de = (this.de).add(r.de);
		return g;
	}
	
	public GaussianRational subtract(GaussianRational r)
	{
		GaussianRational g = new GaussianRational();
		g.nu = (this.nu).subtract(r.nu);
		g.de = (this.de).subtract(r.de);
		return g;
	}
	
	public GaussianRational multiply(GaussianRational r) 
	{
		GaussianRational g = new GaussianRational();
		g.nu = (this.nu).multiply(r.nu);
		g.de = (this.de).multiply(r.de);
		return g;
	}
	
	public GaussianRational divide(GaussianRational r)
	{
		GaussianRational g = new GaussianRational();
		g.nu = (this.nu).divide(r.nu);
		g.de = (this.de).divide(r.de);
		return g;
	}
	
	public GaussianRational invert()
	{
		GaussianRational g = new GaussianRational();
		g.nu = (this.nu).invert();
		g.de = (this.de).invert();
		return g;
	}
	
	public String toString()
	{
		GaussianRational g = new GaussianRational();
		String x = (this.nu).toString();
		String y = (this.de).toString();
		return x+"/"+y;
	}
	
	public void read(long a, long b, long c, long d)
	{
		nu.setNumerator(a/b);
		nu.setDenominator(c/d);
	}
	
	public void write()
	{
		System.out.println("Numerator:" + nu.getNumerator());
		System.out.println("Denominator: " + nu.getDenominator());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int a, b, c, d;
		System.out.println("Enter first number:");
		sc= new Scanner(System.in);
		a= sc.nextInt();
		
		System.out.println("Enter second number:");
		sc= new Scanner(System.in);
		b= sc.nextInt();
		
		System.out.println("Enter third number:");
		sc= new Scanner(System.in);
		c= sc.nextInt();
		
		System.out.println("Enter fourth number:");
		sc= new Scanner(System.in);
		d= sc.nextInt();
		
		GaussianRational s = new GaussianRational(a,b,c,d);
		
	}

}
