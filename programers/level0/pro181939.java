public class pro181939 {
    public int solution(int a, int b) {
        int left = Integer.valueOf(Integer.toString(a) + Integer.toString(b));
        int right = Integer.valueOf(Integer.toString(b) + Integer.toString(a));
        int answer = Math.max(left, right);
        return answer;
    }
}
