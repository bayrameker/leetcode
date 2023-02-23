package org.scriptchief;

public class RichestCustomerWealth {

   public int richestCustomer (int val[][]){
      int tempVal = 0;
      int bigWealth = 0;
      for (int i=0; i<val.length; i++){
         for (int j=0; j<val[0].length; j++){
            tempVal += val[i][j];
         }
         if(tempVal > bigWealth) {
            bigWealth = tempVal;
         }
         tempVal=0;
      }
      return bigWealth;
   }

}
