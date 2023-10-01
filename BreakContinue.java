public class BreakContinue {
    public static void main(String[] args){
        System.out.println("break and continue");
        // we can declare a variable also 
        int age =23;
    for(int x=0;x<=25;x++){
        if(x==age){
            break;
            // continue;
            // System.out.println(x); we can't print here because this loop is already break so it will not read the statement
        }
        System.out.println("x:"+x);
    }
    for(int y=0;y<=10;y++){
        if(y==5){
            continue;
        }
        System.out.println("y:"+y);
    }
    }
}
