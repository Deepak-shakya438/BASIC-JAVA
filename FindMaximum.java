public class FindMaximum {
    
    public static void main(String[] args) {
        System.out.println("hello Deepak you are going to print the maximum number in the array by using");
        int arr[] = {2,3,4,5,2,8,99,10,33,23,54,23,24};
        // for(int element:arr){      //by this we can check the that element is store in the right way
        //     System.out.println(element);
        int max =arr[0];
        for(int i =0; i < arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
            System.out.println(max);
        }
        }
    }

}
