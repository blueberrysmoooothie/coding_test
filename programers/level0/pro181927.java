public class pro181927 {
    public int[] solution(int[] num_list) {
        int a = num_list[num_list.length - 1];
        int b = num_list[num_list.length - 2];
        int[] answer = new int[num_list.length + 1];

        for (int index = 0; index < num_list.length; index++) {
            answer[index] = num_list[index];
        }
        if (a > b) {
            answer[num_list.length] = a - b;
        } else {
            answer[num_list.length] = 2 * a;
        }

        return answer;
    }
}
