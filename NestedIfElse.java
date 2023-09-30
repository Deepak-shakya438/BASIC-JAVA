public class NestedIfElse {
    public static void main(String[] args) {
        // System.out.println();
        int age = 20;
        String gender= "male";
        boolean isRegistered=true;
        if(age==20){
            System.out.println("YEs you are eligible");
            if(gender=="male"){
                System.out.println("YOU are invited");
                if(isRegistered==true){
                    System.out.println("you have the account");
                }
            }else{
                System.out.println("you are not invited");
            }
        }else{
            System.out.println("you are not eligible");
        }
    }
}
