public class MaxMin {
    public static void main(String[] args) {
        System.out.println("HEllo Deepak print the  maximum and minimum numbers");
    
    int arr[]={56,34,34,63,45,67,13,98};
      //wwe want to print the minimum and the maximum numbers so we will let the first element of the array is min and
      //maximum so we will initialize first element by the max and min
      int max = arr[0];
      int min = arr[0];

      // now we will iterate through the array to find the min and max
      for(int i =1; i < arr.length; i++)
      {
        if(arr[i]<min){
            min=arr[i];

        }
        if(arr[i]>max){
            max=arr[i];
        }
      }
      System.out.println(max+" "+min);
    //   System.out.println(min);
    }
}
