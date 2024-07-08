package basic;

import java.util.HashMap;

public class TwoSumHard {
    // Definition for singly-linked list.
     class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    TwoSumHard(){

        ListNode A1=new ListNode(1, new ListNode(5, new ListNode(6)));
        ListNode B2=new ListNode(1, new ListNode(5, new ListNode(6)));
        System.out.println("this is the Sum:-  " +sum(A1,B2));
    }

  public int sum(ListNode l1,ListNode l2){
      return  0;
  }

}



