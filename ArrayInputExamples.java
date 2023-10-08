import java.util.Scanner;

public class ArrayInputExamples {
    public static void main(String[] args) {
        System.out.println("please enter total element of the array");
        Scanner scan = new Scanner(System.in);
        // int x=scan.nextInt();
        int totalInput=scan.nextInt(); // ham iske anar 10 value daalenge uske lie for loop run krna hoga
        // total input means how much value you want to store in the array.
        int inputArr[]=new int[totalInput]; 
        // System.out.println("output from the system after taking input from the user"); 
        // System.out.println(x);
        System.out.println("please enter array element value");
        for(int i=0;i<totalInput;i++){
            inputArr[i]=scan.nextInt();
            
        }
        System.out.println("Array elemensts are here");
        for(int i=0;i<totalInput;i++){
            System.out.print(inputArr[i]+" ");
        }
        }
}
