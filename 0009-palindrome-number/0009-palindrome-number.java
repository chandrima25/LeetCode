class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int revnum = 0;
        int original = x;
        while (x != 0) {
            int s = x % 10;
            revnum = revnum * 10 + s;
            x = x / 10;
        }
        return revnum == original;

        
    }
}