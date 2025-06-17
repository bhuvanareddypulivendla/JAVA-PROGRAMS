import java.util.HashMap;
import java.util.Map;
public class TwoSum{
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(mp.containsKey(a)){
                return new int[]{ mp.get(a),i};
            }
            mp.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args){
        int[] nums={2,6,9,11};
        int target=9;
        int[] result=twoSum(nums,target);
        if(result!=null){
        System.out.println(" Indices:["+result[0]+","+result[1]+"]");
        }
        else{
            System.out.println("no twoSum is fond.");
        }
    }
}