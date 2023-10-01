import java.util.Scanner;

public class WhileLoopExam {
    public static void main(String[] args) {
        // System.out.println("while loop will be here");
        // int item =0;
        // while(item<10){
        // item++;
        // System.out.println(item);   
        System.out.println("please enter max value of loop");
        Scanner scan = new Scanner(System.in);
        int maxData = scan.nextInt();
        int data =0;
           while (data<maxData){
            data++;
             System.out.println(data);
            //i have given the condition that it will count the no who gives remainder 1 and divide by 3
            // if(data%3==1){
            //     System.out.println(data);
            // }
           }
    }
}
