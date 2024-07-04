import java.util.*;
class ListNode{
    int val;
    ListNode next;

    ListNode(int d){
        val = d;
        next = null;
    }
}
public class MergeNodesInBetweenZeros {

    public  static ListNode mergeNodes(ListNode head) {

        if(head==null){
            return null;
        }

        if(head.next==null && head.val!=0){
            return head;
        }

        if(head.next==null && head.val==0){
            return null;
        }


        ListNode curr = head;
        int d = 0;

        ListNode prev = new ListNode(-1);
        ListNode c = prev;

        while(curr!=null){
            if(curr.val!=0){
                d += curr.val;
            }
            else if(curr.val==0 && d!=0){
                ListNode temp = new ListNode(d);
                prev.next=temp;
                prev=prev.next;
                d=0;
            }

            curr=curr.next;
        }

        c = c.next;

        return c;

    }
    public static void main(String[] args) {

        ListNode node = new ListNode(0);
        node.next = new ListNode(3);
        node.next.next  =new ListNode(1);
        node.next.next.next = new ListNode(0);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next.next = new ListNode(2);
        node.next.next.next.next.next.next.next = new ListNode(0);


        ListNode res = mergeNodes(node);

        ListNode prev = res;

        while(prev!=null){
            System.out.print(prev.val + " ");
            prev = prev.next;
        }

    }
}
