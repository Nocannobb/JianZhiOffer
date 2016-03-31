/**
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减序列的一个旋转，
输出旋转数组的最小元素。例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
*/

public class Solution {
    public int minNumberInRotateArray(int [] array) {
    	if(array==null||array.length<=0)
    		throw new IllegalArgumentException();
    	int low=0;
    	int high=array.length-1;
    	int mid=low;
    	while(array[low] >= array[high]){
    		if(high-low == 1){
    			mid = high;
    			break;
    		}
    		mid=(low+high)/2;
    		if(array [low] == array [mid] && array[mid] == array[high])
    			return minInOrder(array, low, high );
    		if(array[mid] >= array[low]){
    			low=mid;
    		}
    		if(array[mid] <= array[high]){
    			high=mid;
    		}
    	}
    	return array[mid];
    }
    public int minInOrder(int[] a, int low, int high){
    	int min=a[low];
    	for(int i=low;i<high;i++){
    		if(min>a[i]){
    			min=a[i];
    		}
    	}    	
    	return min;
    }
}