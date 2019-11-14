package medium._2831;

/**
 * 两数相加
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(0);
        ListNode referen=ans;
        do {
            int temp=l1.val+l2.val;
            referen.val+=temp%10;
            ListNode l3=new ListNode(temp/10);
            referen.next=l3;
            referen=l3;
            if(l1.next!=null){
                l1=l1.next;
                System.out.println(l1.val);
            }
            else
                l1.val=0;
            if(l2.next!=null){
                l2=l2.next;
                System.out.println(l2.val);
            }
            else
                l2.val=0;

        }
        while (l1==null||l2==null);
        return ans;
    }
}
