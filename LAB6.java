package CIE;
public class Student1{
public String USN;
public String Name;
public int Sem;

public Student1(String USN,String Name,int Sem)
{
this.USN=USN;
this.Name=Name;
this.Sem=Sem;
}
}

package CIE;
public class Internals extends Student1{
public int[] internalMarks;
public Internals(String USN,String Name,int Sem,int[] internalMarks)
{
super(USN,Name,Sem);
this.internalMarks=internalMarks;
}
}

package SEE;
import CIE.Student1;
public class External extends Student1{
public int[] externalMarks;
public External(String USN,String Name,int Sem,int[] externalMarks)
{
super(USN,Name,Sem);
this.externalMarks=externalMarks;
}
}  


import CIE.*;
import SEE.*;
import java.util.Scanner;

public class FinalMarks {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of students: ");
int n = sc.nextInt();

Internals[] internalStudents = new Internals[n];
External[] externalStudents = new External[n];

for (int i = 0; i < n; i++) {
System.out.println("Enter details for student " + (i + 1) + ":");
System.out.print("USN: ");
String usn = sc.next();
System.out.print("Name: ");
String name = sc.next();
System.out.print("Semester: ");
int sem = sc.nextInt();

int[] internalMarks = new int[5];
System.out.println("Enter 5 internal marks:");
for (int j = 0; j < 5; j++) {
internalMarks[j] = sc.nextInt();
}

int[] externalMarks = new int[5];
System.out.println("Enter 5 SEE marks:");
for (int j = 0; j < 5; j++) {
externalMarks[j] = sc.nextInt();
}

internalStudents[i] = new Internals(usn, name, sem, internalMarks);
externalStudents[i] = new External(usn, name, sem, externalMarks);
}

System.out.println("\nFinal Marks of Students:");
for (int i = 0; i < n; i++) {
System.out.println("Student " + (i + 1) + " (" + internalStudents[i].Name + "):");

System.out.println("Course-wise marks:");
for (int j = 0; j < 5; j++) {
int finalMark = internalStudents[i].internalMarks[j] + (externalStudents[i].externalMarks[j] / 2);
System.out.println("Course " + (j + 1) + ": " + finalMark);
}
}

sc.close();
}
}