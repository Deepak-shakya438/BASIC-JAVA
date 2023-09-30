import java.util.Scanner;

public class ConditionWithInput {
    public static void main(String[] args) {
        System.out.println("Enter  your age ");
        Scanner scan = new Scanner(System.in);
        int age=scan.nextInt();
        String name = scan.nextLine();
        System.out.println("your age is");
        System.out.println(age);
        if(age >=18){
            System.out.println("welcome to the club");
        }
        else if(age == 18 && name==john){
            System.out.println("yes you can enter to the club john");
        }
        else{
            System.out.println("you are not allowed in the club");
        }
    }
}
