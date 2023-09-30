import java.util.Scanner;

public class functionsParameterized {
    public static void main(String[] args) {
        System.out.println("hello newton your age is ");
        // Scanner sc = new Scanner(System.in);
        // int calculateInterestRate=sc.nextInt();
        int d1=20;
        getAgeInDays(d1);
        int d2=30;
        getAgeInDays(d2);

        int amount=10000;
        int time = 1;
        int rate = 12;
        calculateInterestRate(amount, time, rate);
    }
    public static void getAgeInDays(int age){
System.out.println(age*365);
    }
    public static void calculateInterestRate(int amount,int time,int rate){
        System.out.println((amount*time*rate)/100);
    }
}
