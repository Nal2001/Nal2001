import java.net.Socket;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principal:");
        int Principal=input.nextInt();
        System.out.println("Enter the time:");
        double time=input.nextDouble();
        System.out.println("Enter the rate:");
        double rate=input.nextDouble();
        double SimpleInterest=(Principal*time*rate)/100;
        System.out.println("The simple interest is "+SimpleInterest);
    }
    
}
