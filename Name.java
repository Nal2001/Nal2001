import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the name");
        String name=input.next();
        if(name.equals("Nalin")){
            System.out.println("Hi! Welcome Home.");
        }
        else{
            System.out.println("Intruder Alert !");
        }
        
    }
}
