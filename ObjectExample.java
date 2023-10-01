public class ObjectExample {
    public static void main(String[] args) {
        // System.out.println("hello Object");
        //now we are making the object of class student
        Student s1 = new Student();
        
        //we can directly print the s1.getname();
        System.out.println(s1.getName());
        s1.displayName();
        System.out.println(" age is "+s1.defaultAge);
        // now we will create an object again for the class Teacher;
        Teacher t1=new Teacher();
        // from here we can pass value to the teacher class by creating variable
        String tName="Rohit sir our DSA instructor";
        t1.displayName(tName);//here this is the function name that we have made this inside the class name teacher
    }
}
class Student{
    int defaultAge=18;
    String getName(){
        return "Deepak";
    }
    //now you are thinking that you want to print here then we will create a function type void
    void displayName(){
        System.out.println("Deepak is in the display function");
    }
}
    //creating another class, inside the class create the function
    class Teacher{
        // we will update argument type to the variable
      void displayName(String name){
        System.out.println(name);
      }
    }
