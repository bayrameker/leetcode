package org.scriptchief;

public class StepsToReduce {
        public int steptoClassResult(int val){
                int sayac=0;
                while(val>0){
                        if(val%2==0){
                                val/=2;
                               sayac++;
                        }
                        else{
                                val-=1;
                                sayac++;
                        }
                }
                return sayac;

        }

        public int stepToClassBetter(int val){

        }

}
