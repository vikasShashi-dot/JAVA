import java.util.*;
abstract class Figure{
double dim1;
double dim2;
Figure(double a,double b)
{
dim1=a;
dim2=b;
}
abstract double area();
}
class rectangle extends Figure{
rectangle(double a,double b){super(a,b);}
double area()
{
System.out.println("inside area of rectangle:");
return dim1*dim2;
}
}
class triangle extends Figure{
triangle(double a,double b){super(a,b);}
double area()
{
System.out.println("inside area of triangle:");
return (dim1*dim2)/2;
}
}
class circle extends Figure{
circle(double a){super(a,a);}
double area()
{
System.out.println("inside area of circle:");
return Math.PI*(dim1*dim1);

}
}
class AbstractArea{
public static void main(String [] args){
rectangle r=new rectangle(10,20);
triangle t=new triangle(3,5);
circle c=new circle(9);
Figure figref;
figref=r;
System.out.println("area is:"+figref.area());
figref=t;
System.out.println("area is:"+figref.area());
figref=c;
System.out.println("area is:"+figref.area());
}
}