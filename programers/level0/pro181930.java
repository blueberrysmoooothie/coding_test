public class pro181930 {
    public int solution(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return 27 * ((int) Math.pow(a, 6));
        } else if (a == b || b == c || a == c) {
            return (a + b + c) * (((int) Math.pow(a, 2)) + ((int) Math.pow(b, 2)) + ((int) Math.pow(c, 2)));
        } else {
            return (a + b + c);
        }

    }

}
