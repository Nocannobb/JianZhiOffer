import java.util.Stack;
/**
������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�

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