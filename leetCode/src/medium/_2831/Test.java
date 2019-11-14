package medium._2831;


import java.util.LinkedList;

public class Test {
    public static void  main(String[] args){
        ListNode listNode=new ListNode(2);
        listNode.next=new ListNode(4);
        listNode.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        Solution solution=new Solution();
        ListNode ans=solution.addTwoNumbers(listNode,l2);
        while (ans!=null){
            System.out.print(ans.val+"->");
            ans.next=ans;
        }
//        LinkedList
//        System.out.println(ans.val+"->"+ans.next.val+"->"+ans.next.next.val);
    }
}
