import java.util.Scanner;
public class quadratic{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double a,b,c,r1,r2,d;
System.out.println("enter coefficient a:");
a=sc.nextDouble();
System.out.println("enter coefficient b:");
b=sc.nextDouble();
System.out.println("enter coefficient c:");
c=sc.nextDouble();
if(a==0)
{
System.out.println("invalid input");
}
else
{
d=b*b-4*a*c;
if(d>0)
{
System.out.println("the roots are real and distinct");
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("r1="+r1);
System.out.println("r2="+r2);
}
else if(d<0)
{
System.out.println("there are no real solutions");
}
else
{
System.out.println("the roots are real and equal");
r1=r2=-b/(2*a);
System.out.println("r1=r2="+r1);
}
}
}
}