import java.util.*;
public class kadanes{
    public static int maxNum(int[] nums){
        int result=nums[0];
        int maxEnding=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEnding=Math.max(maxEnding+nums[i],nums[i]);
            result=Math.max(maxEnding,result);
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums={1,-2,3,-3,-5,7,9,1,-2,8};
        int res=maxNum(nums);
        System.out.println("the maxSum of the array is:"+res);
    }
}