package com.Jianoffer.Array;
/*
旋转数组中的最小数字
输入一个递增的旋转数组，如{3,4,5,1,2}；
输出旋转数组中的最小元素{1,2,3，4,5}.

可根据二分查找
 */
public class offer_11_reverse_minnumber {
    public int Solution(int[] nums){
        if(nums.length==0){
            return -1;
        }
        int index1 = 0;
        int index2 = nums.length-1;
        int indexMid = index1;
        if( nums[index1] < nums[index2]){
            return nums[indexMid];
        }
        while(nums[index1] >= nums[index2]){
            if(index2-index1==1){
                indexMid = index2;
                break;
            }
            indexMid = (index1+index2)/2;
            //特殊情况 index1 index2 indexMid指向的三个数相等，只能通过顺序查找最小元素
            if(nums[index1]==nums[index2]&&nums[index1]==nums[indexMid]){
                return InOrder(nums,index1,index2);
            }
            //中间元素大于等于第一个元素，则最小元素在其后方,则index1移向indexMid
            if(nums[indexMid]>=nums[index1]){
                index1 = indexMid;
            }else if(nums[indexMid]<=nums[2]) {
                //最小元素在indexMid前面
                index2 = indexMid;
            }
        }
        return nums[indexMid];
    }
    private int InOrder(int[] nums,int index1,int index2){
        int result = nums[index1];
        for (int i = index1+1; i < index2; i++) {
            if(result>nums[i]){
                return nums[i];
            }
        }
        return result;
    }
}
