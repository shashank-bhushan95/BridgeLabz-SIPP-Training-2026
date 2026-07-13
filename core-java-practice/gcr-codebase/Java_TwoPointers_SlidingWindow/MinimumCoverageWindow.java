package Java_TwoPointers_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumCoverageWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        Map<Character, Integer> need = new HashMap<>(), win = new HashMap<>();
        for (char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);
        int req = need.size(), formed = 0, l = 0, start = 0, min = Integer.MAX_VALUE;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            win.put(c, win.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && win.get(c).intValue() == need.get(c).intValue()) formed++;
            while (formed == req) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }
                char x = s.charAt(l++);
                win.put(x, win.get(x) - 1);
                if (need.containsKey(x) && win.get(x) < need.get(x)) formed--;
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? "" : s.substring(start, start + min));
    }
}