#BY BRUTE FORCE (TLE)
import java.util.*;

public class Main {
    public static List<List<Integer>> triplet(int n, int[] nums) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int n = nums.length;

        List<List<Integer>> result = triplet(n, nums);

        for (List<Integer> trip : result) {
            for (int x : trip) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

# BETTER APPROCH 

import java.util.*;

public class Main {
    public static List<List<Integer>> triplet(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = triplet(nums);

        for (List<Integer> trip : result) {
            System.out.println(trip);
        }
    }
}


# OPTIMIZED APPROCH

import java.util.*;

public class Main {
    public static List<List<Integer>> triplet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort array

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            // Step 2: skip duplicates for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;       // left pointer
            int k = n - 1;       // right pointer

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++; // increase left pointer
                } else if (sum > 0) {
                    k--; // decrease right pointer
                } else {
                    // found a valid triplet
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // Step 3: skip duplicates for 'j' and 'k'
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = triplet(nums);

        for (List<Integer> trip : result) {
            System.out.println(trip);
        }
    }
}






