import java.util.Scanner;

public class InputScanner {
    // public static void main(String[] args) {
    //     System.out.println("InputScanner please enter any number");
    //    // int a =10;
    //     Scanner scan = new Scanner(System.in);
    //     int a =scan.nextInt();
    //     System.out.println("your enter value is this");
    //     System.out.println(a);
    // }

public static void main(String[] args) {
    System.out.println("please enter your name,age and salary" );
    Scanner scan = new Scanner(System.in);
    String name=scan.nextLine();
    int age =scan.nextInt();
    float salary=scan.nextFloat();
    //System.out.println("your name is");
    System.out.println("your name is "+name);
    System.out.println("your age is "+age);
    System.out.println("your salary is "+salary);
}
}
