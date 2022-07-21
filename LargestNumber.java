import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println("Number 1 is the largest:");
        
        }
        else if(num1==num2){
        System.out.println("Both the numbers are equal:");
        }
        else{
            System.out.println("The number");
        }
    }
    
}
