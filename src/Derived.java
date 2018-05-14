import java.util.Scanner;

class Derived extends Base {
   
    public void foo() {
        
    
        System.out.print("Enter Your name");
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
        
        System.out.println("your name entered is: "+s);
        
    
    } 
}