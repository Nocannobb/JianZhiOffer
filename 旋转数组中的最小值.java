/**
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת������һ���ǵݼ����е�һ����ת��
�����ת�������СԪ�ء���������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
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