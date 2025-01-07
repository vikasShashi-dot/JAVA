import java.util.Scanner;

class student {
    String USN;
    String Name;
    int marks[] = new int[10];
    int credits[] = new int[10];
    int sub;

    void acceptDetails(String U, String N, int sub, Scanner sc) {
        USN = U;
        Name = N;
        this.sub = sub;
        System.out.println("Enter the details:");
        for (int i = 0; i < sub; i++) {
            System.out.println("Enter the marks of subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            System.out.println("Enter credits of subject " + (i + 1) + ":");
            credits[i] = sc.nextInt();
        }
    }

    void display_details() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + Name);
    }

    double calsgpa() {
        double total_marks = 0;
        double total_credits = 0;
        for (int i = 0; i < sub; i++) {
            total_marks += marks[i] * credits[i];
            total_credits += credits[i];
        }

        if (total_credits == 0) return 0;
        return total_marks / (total_credits * 10);
    }
}

public class studinfo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int sub = sc.nextInt();

        student std = new student();
        std.acceptDetails("1WA23CS055", "YUKTA", sub, sc);
        std.display_details();
        
        double sgpa = std.calsgpa();
        System.out.println("SGPA: " + sgpa);
        
        sc.close();
    }
}