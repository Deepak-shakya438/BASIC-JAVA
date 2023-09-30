public class PrintVsReturn {
    public static void main(String[] args) {
        // System.out.println("Hello world");//this output show in the console;;
        // getData() //this will not give any output when we call this function;;
         int data=getData(); //we will define a variable in that we will store that return value; 
          System.out.println(data);    
        }
    public static int getData(){   // when we create any function then we demand that this function should give some output to us in return;
        return 20;//if data type is void then there is no need to return;
    }// this return value does not display in the console.../does not display in the output
}
