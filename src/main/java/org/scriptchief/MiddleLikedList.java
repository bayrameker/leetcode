package org.scriptchief;

import java.util.ArrayList;

public class MiddleLikedList  {
    public ListNode getMiddleLnkedList(ListNode val){
        ArrayList<ListNode> arrayList = new ArrayList<ListNode>();
        int count = 0;

        while(val!=null){
            arrayList.add(val);
            val=val.next;
            count++;
        }

        return arrayList.get(count/2);
    }


}




