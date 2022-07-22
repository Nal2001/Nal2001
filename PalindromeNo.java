import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  a number:");
        int num=input.nextInt();
        int remainder,sum=0;
        int temp=num;
        while(num>0){
            remainder=num%10;
           sum=(sum*10)+remainder;
           num=num/10;
    }
      
        if(temp==sum){
            System.out.println("The number is palindrome:");
        }
        else{
            System.out.println("The number is not palindrome:");
        }
    
    
}
}