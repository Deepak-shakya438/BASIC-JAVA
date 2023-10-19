import java.util.Scanner;

public class ReverseNaturalNUm {
    public static void main(String[]args){
        System.out.println("hey i am going to print the natural number but in the decreasing order");
        Scanner sc = new Scanner(System.in);
        System.out.println("the input taken from the user");
        int n = sc.nextInt();
        System.out.println("the numbers are:");
        for(int i=n-1;i>=0;i--){
            // System.out.println();
            System.out.println(i);
        }
    }
}
