class Solution {
    public int jump(int[] nums) {
        //l means last index
        int steps = 0, currentStop = 0, currentposition = 0, l = nums.length - 1;

        for (int i = 0; i < l; ++i) {
            currentposition = Math.max(currentposition, i + nums[i]);
            if (i == currentStop) {
                steps += 1;
                currentStop = currentposition;
                if (currentStop >= l) return steps;
            }
        }

        return steps;
    }
}