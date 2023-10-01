import java.util.Scanner;

public class ForLoopExample2 {
    public static void main(String[] args) {
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println("I value is  "+i);
        //     for(int j=1;j<=5;j++){
        //         System.out.println(j);
        //     }

        // }
    //     System.out.println("Enter maximum loop value");
    // Scanner sc = new Scanner(System.in);
    // int userVAlue=sc.nextInt();
    // for(int i=0;i<=userVAlue;i++)
    // {
    //     System.out.println(i);
    // }

    // exercise take two input from the user and then print them we will print them in a way of for loop inside for loop
    Scanner sc = new Scanner(System.in);
    int forOne =sc.nextInt();
    int forTwo= sc.nextInt();
    for(int i=1;i<=forOne;i++){
        System.out.println("this is the value of i is "+i);
        for(int j=1;j<=forTwo;j++){
            System.out.println(j);
        }
    }
    }

}
