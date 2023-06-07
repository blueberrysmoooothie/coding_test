class Solution {
    public int solution(int n, String control) {
        int[] cnts = { 0, 0 };
        for (int index = 0; index < control.length(); index++) {
            char c = control.charAt(index);
            if (c == 'w') {
                cnts[1]++;
            } else if (c == 's') {
                cnts[1]--;
            } else if (c == 'd') {
                cnts[0]++;
            } else {
                cnts[0]--;
            }
        }
        return cnts[0] * 10 + cnts[1] + n;

    }
}
