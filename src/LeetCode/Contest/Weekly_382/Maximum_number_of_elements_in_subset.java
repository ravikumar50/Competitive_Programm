package LeetCode.Contest.Weekly_382;
import java.util.*;
public class Maximum_number_of_elements_in_subset {
    static long ans = 1;
    static Map<Long, Long> m = new HashMap<>();
    static Set<Long> s = new HashSet<>();

    static void answer(long key, long count) {
        if (m.getOrDefault(key, 0L) >= 2) {
            long temp = key * key;
            s.add(temp);
            count += 2;
            answer(temp, count);
            return;
        } else if (m.getOrDefault(key, 0L) == 1) {
            count++;
            ans = Math.max(ans, count);
        } else {
            count--;
            ans = Math.max(ans, count);
        }
    }
    public static int maximumLength(int[] nums) {
        for (int i : nums) {
            m.put((long) i, m.getOrDefault((long) i, 0L) + 1);
        }

        for (Map.Entry<Long, Long> entry : m.entrySet()) {
            long key = entry.getKey();
            long value = entry.getValue();

            if (key == 1) {
                ans = Math.max(ans, value);
                if (ans % 2 == 0) {
                    ans--;
                }
                continue;
            } else if (s.contains(key)) {
                continue;
            }

            answer(key, 0);
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,2,2};
        System.out.println(maximumLength(arr));
    }
}
