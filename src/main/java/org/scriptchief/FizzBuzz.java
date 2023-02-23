package org.scriptchief;

public class FizzBuzz {
    public String[] getFizzBuzz(int val){
        String[] result = new String[val];
        for(int i=0; i<val; i++){
            if((i+1)%3==0 && (i+1)%5==0){
                result[i] = "FizzBuzz";
            }
            else if((i+1)%3==0){
                result[i] = "Fizz";
            }
            else if((i+1)%5==0){
                result[i] = "Buzz";
            }
            else{
                result[i] = Integer.toString(i+1);
            }
        }

        return result;

    }
}
