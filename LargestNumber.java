import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int num1=input.nextInt(), num2=input.nextInt(),num3=input.nextInt();
        int max=num1;
        if(num1>num2){
            max=num2;
        
        }
        if(num3>max){
        max=num3;
        }
        System.out.println(max);
    }
    
}
