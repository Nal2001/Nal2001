import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int num1=0,num2=1;
        System.out.print(num1+" "+num2);
        // while(count<n){
        //     int num3=num1+num2;
        //     num1=num2;
        //     num2=num3;
        //     System.out.print(" "+num3);
        //     count++;

        // }
        for(int count=2;count<n;count++){
            int num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(" "+num3);
        }
    }
    
}
