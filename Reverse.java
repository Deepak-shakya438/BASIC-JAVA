import java.util.*;
class Main{

    static int reverse(int num){
        int rev = 0;

        while(num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }
        return rev%10;
    }
    public static void main(String[] args) {
        // Your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int[]arr = new int[size];
        for(int i=0; i<size; i++){
          arr[i] = sc.nextInt();

        }
        for(int element:arr){
            System.out.println(element);
        }
  
        for(int j = 0; j<size; j++){
            System.out.println(reverse(arr[j]));
        }
    }
}
