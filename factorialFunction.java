import java.util.Scanner;

public class factorialFunction {
    
    public static void factorialSum(int n){
        if(n<0){
            System.out.println("the number is invalid");
            return;
        }
        // we will run a loop to calculate the factorial
       //we will initialise the variable by 1 because if we initialise it by zero then whole thing will be zero;
           int factorial=1;
       for(int i=n;i>=1;i--){
        factorial=factorial*i;  
        
        }
        System.out.println(factorial);
        return;
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    factorialSum(n);
    }

}
