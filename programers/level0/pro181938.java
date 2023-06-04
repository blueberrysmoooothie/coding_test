public class pro181938 {
    public int solution(int a, int b) {
        String num = Integer.toString(a) + Integer.toString(b);
        int answer = Math.max(Integer.valueOf(num), 2 * a * b);
        return answer;
    }
}
