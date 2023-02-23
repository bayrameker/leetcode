package org.scriptchief;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int tempVal = x;
        int sayac = 0;
        int newVal[] = new int[10];
        if(x==0) return true;
        while(tempVal>0){
            newVal[sayac] = tempVal%10;
            tempVal/=10;
            sayac++;
        }
       if(x > 0 && tempVal<1){
            for(int i =sayac-1; i>=0 ;i--){
                if(newVal[i] == x%10){
                    x/=10;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }

    }

    public boolean isPalindromeGood(int x) {
        int actualValue=x; int r=0;
        while(x > 0){
            int digit= x%10;
            r=r*10+digit;
            x=x/10;
        }
        if(actualValue == r){
            return true;
        }
        return false;
    }

    public boolean isPalindromeBetter(int x) {
        if(x < 0) {
            return false;
        }

        int y = x;
        int z = 0;
        while(y > 0){
            z = z * 10 + y % 10;
            y = y / 10;
        }

        return x == z;
    }

}
