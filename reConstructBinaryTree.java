/**
 *����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�
 ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�

 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null||in==null||pre.length<=0||in.length<=0)
            return null;
        return ConstructCore(0,pre.length-1,0,in.length-1, pre,in);
         
         
    }
    public TreeNode ConstructCore(int startPreOrder,int endPreOrder,int startInOrder,int endInOrder,int[] pre,int[]in){
        int rootValue=pre[startPreOrder];
        TreeNode rootNode=new TreeNode(rootValue);
        rootNode.left=rootNode.right=null;
        if(startPreOrder==endPreOrder&&startInOrder==endInOrder){
            return rootNode;
        }
        int rootInOrder=startInOrder;
        while(rootInOrder<=endInOrder&&in[rootInOrder]!=rootValue){
            rootInOrder++;
        }
        int leftLength=rootInOrder-startInOrder;
        if(leftLength>0){
            rootNode.left=ConstructCore(startPreOrder+1,startPreOrder+leftLength,startInOrder,rootInOrder-1,pre,in);
        }
        if(leftLength<endPreOrder-startPreOrder){
            rootNode.right=ConstructCore(startPreOrder+leftLength+1,endPreOrder,rootInOrder+1,endInOrder,pre,in);
        }
        return rootNode;
    }
 
}