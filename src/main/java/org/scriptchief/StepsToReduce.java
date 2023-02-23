package org.scriptchief;

public class StepsToReduce {
        public int steptoClassResult(int val){
                int sayac=0;
                while(val>0){
                        if(val%2==0){
                                val/=2;
                        }
                        else{
                                val-=1;
                        }
                        sayac++;
                }
                return sayac;

        }

        public int stepToClassBetter(int val){
               int sayac=0;

                while(val>0){
                        if((val & 1) == 0){
                                val>>=1;
                        }
                        else{
                                val--;
                        }
                        sayac++;
                }
                return sayac;
        }

}
