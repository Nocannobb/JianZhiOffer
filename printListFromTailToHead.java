/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.*;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         
        Stack<ListNode>stack=new Stack<ListNode>();
        ArrayList<Integer> list =new ArrayList<Integer>();
        ListNode pNode=listNode;
         
        while(pNode!=null){
           stack.push(pNode);
            pNode=pNode.next;
             
        }
        while(!stack.empty()){
            list.add(stack.pop().val);
        }
        return list;
         
    }
}