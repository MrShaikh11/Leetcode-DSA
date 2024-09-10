class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l = 0;
        int r = cardPoints.length - 1;
        int sum = 0, lsum = 0, rsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        sum = lsum;
        int rIndex = cardPoints.length - 1;
        for (int i = k; i > 0; i--) {
            lsum -= cardPoints[i - 1];
            rsum += cardPoints[rIndex--];
            sum = Math.max(sum, (lsum + rsum));
        }
        return sum;
    }
}