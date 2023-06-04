//https://school.programmers.co.kr/learn/courses/30/lessons/181928

public class pro181928 {
    public int solution(int[] num_list) {
        String odd_nums = "";
        String even_nums = "";
        for (int index = 0; index < num_list.length; index++) {
            int num = num_list[index];
            if (num % 2 == 1) {
                odd_nums += Integer.toString(num);
            } else {
                even_nums += Integer.toString(num);
            }
        }
        System.out.println(odd_nums);

        System.out.println(even_nums);

        int answer = Integer.valueOf(odd_nums) + Integer.valueOf(even_nums);

        return answer;
    }

    public void main() {
        int[] num_list = { 1, 2, 3 };
        int answer = solution(num_list);
        System.out.println(answer);
    }
}
