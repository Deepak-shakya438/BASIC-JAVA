public class EvenOdd {
    public static void main(String[]args){
        System.out.println("we are going to print the maximum and minimum");
        int arr[]={3,3,4,57,9,53,8,40,30,56,45};
        // for(int element:arr){
        //     System.out.println(element);//this is for to check that the element is passing or not into the array
        // }
        int sum=0;
        int evenNum = 0;
        int oddNum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            
            if(arr[i]%2 == 0){
                evenNum = arr[i];
            System.out.println("even numbers are :"+evenNum);   
            }else if(arr[i]%2 == 1){
                oddNum = arr[i];
                System.out.println("odd numbers are :"+oddNum);
            }
        
        }
        System.out.println("the sum of the element is :"+sum);
    }
}
