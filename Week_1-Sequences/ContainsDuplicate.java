import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicateSolution(nums));
    }

    public static boolean containsDuplicateSolution(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
