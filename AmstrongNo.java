import java.util.Scanner;

public class AmstrongNo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=input.nextInt();
        int rem,result=0,temp;
        temp=num;
        while(num>0){
            rem=num%10;
            result+=Math.pow(rem, 3);
            num=num/10;
        }
        if(temp==result){
            System.out.println("The Number is Amstrong:");
        }
        else{
            System.out.println("The Number is Not Amstrong:");
        }
    }
    
    }

