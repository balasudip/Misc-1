// Time Complexity: O(log target)
// Space Complexity: O(1)
class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans = 0;
        while(target > startValue) {
            ans++;
            if(target % 2 == 1) {
                target++;
            } else {
                target = target / 2;
            }
        }
        return ans + startValue - target;
    }
}