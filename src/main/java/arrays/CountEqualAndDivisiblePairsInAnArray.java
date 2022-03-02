package arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
public class CountEqualAndDivisiblePairsInAnArray {
    public int countPairs(int[] nums, int k) {
        int res = 0;
        List<Integer>[] map = new List[101];
        for (int i = 0; i < nums.length; i++) {
            if (map[nums[i]] == null) map[nums[i]] = new ArrayList<>();
            for (int e : map[nums[i]])
                if ((e * i) % k == 0)
                    res++;
            map[nums[i]].add(i);
        }
        return res;
    }
}
