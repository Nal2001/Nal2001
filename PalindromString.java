import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.nextLine();
        String rev="";
        int length=str.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
            if(str.equals(rev)){
                System.out.println("String is palindrome:");
            }
            else{
                System.out.println("The String is not palindrome:");
            }
            
        }
    }
    

