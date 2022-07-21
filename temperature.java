import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the the temperature in celsius:");
        float celsius=input.nextFloat();
        float farenhiet=(celsius*9/5)+32;
        System.out.println("Temperature in farenhiet is " +farenhiet);

    }
    
}
