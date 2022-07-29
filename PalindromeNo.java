import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int remainder,sum=0;
        int temp=x;
        while(x>0){
            remainder=x%10;
           sum=(sum*10)+remainder;
           x=x/10;
        }
    return sum==temp;
        
    }
}
