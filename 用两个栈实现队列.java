import java.util.Stack;
/**
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

*/
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
        
    }
    
    public int pop() {
        if(stack2.size()<=0){
             while (stack1.size()>0){
             int element=stack1.pop();
             stack2.push(element);
          }
        }
        return stack2.pop();
    
    }
}