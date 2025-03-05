class Solution {
    public int countSetBits(int n){
        int cnt = 0;
        while(n != 0){
            n = n & (n-1);
            cnt ++;
        }
        return cnt;
    }
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        return countSetBits(ans);
    }
}