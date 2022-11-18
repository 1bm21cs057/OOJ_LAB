import java.util.Scanner;
class quadratic_equation
{
	public static void main(String args[])
	{
		double a,b,c,d,r1,r2;
		System.out.println("Ënter the value of coefficients: ");
		Scanner scan=new Scanner(System.in);
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		d=b*b-4*a*c;
		if(d>0)
		{
		 r1=(-b+Math.pow(d,0.5)/(2.0*a));
 		 r2=(-b-Math.pow(d,0.5)/(2.0*a));
		 System.out.println("Roots are real and distinct"+" "+r1+" "+r2);
		}
		else if(d==0)
		{
		 r1=-b/2.0*a;
		 System.out.println("Roots are real and equal"+" "+r1);
		}
		else
		{
  		System.out.println("Roots are imaginary");
		r1=-b/2.0*a;
		r2=Math.pow(Math.abs(d),0.5);
		System.out.println(r1+"+"+"i"+r2);
		System.out.println(r1+"-"+"i"+r2);
		}
	}
}


