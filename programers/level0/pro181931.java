public class pro181931 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int index_cnt = 0;
        int index_sum = 0;
        for (int index = 0; index < included.length; index++) {
            if (included[index]) {
                index_cnt++;
                index_sum += index;
            }
        }
        answer = a * index_cnt + d * index_sum;
        return answer;
    }
}
