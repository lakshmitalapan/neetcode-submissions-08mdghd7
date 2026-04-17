class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i], max);
        }
        int min = 1;
        int mid = 0;
        int last = 0;
        int total_time;
        while (min <= max && max > 0) {
            mid = (min + max) / 2;
            total_time = 0;
            for (int i = 0; i < piles.length; i++) {
                if ((piles[i] % mid) == 0) {
                    total_time += (piles[i] / mid);
                } else {
                    total_time += (piles[i] / mid) + 1;
                }
            }
            if (total_time <= h) {
                last = mid;
                max = mid - 1;
            } else if (total_time > h) {
                min = mid + 1;
            }
        }
        return last;
    }
}
