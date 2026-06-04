import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!s.contains(i)) {
                ans.add(i);
            }
        }

        return ans;

    }
}
