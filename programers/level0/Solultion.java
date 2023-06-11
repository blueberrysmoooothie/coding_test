
import java.util.List;
import java.util.LinkedList;

public class Solultion {

    // 수열과 구간쿼리 4
    // https://school.programmers.co.kr/learn/courses/30/lessons/181922?language=java
    public int[] solution(int[] arr, int[][] queries) {
        for (int index = 0; index < queries.length; index++) {
            int f = queries[index][0] / queries[index][2];
            if (queries[index][0] % queries[index][2] != 0) {
                f++;
            }
            int t = queries[index][1] / queries[index][2];

            for (int ind = f; ind < t + 1; ind++) {
                arr[ind * queries[index][2]]++;
            }

        }
        return arr;
    }

    // 문자열 겹쳐쓰기
    // https://school.programmers.co.kr/learn/courses/30/lessons/181943
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());
        return answer;
    }

    // 더 크게 합치기
    // https://school.programmers.co.kr/learn/courses/30/lessons/181939
    public int solution(int a, int b) {
        int left = Integer.valueOf(Integer.toString(a) + Integer.toString(b));
        int right = Integer.valueOf(Integer.toString(b) + Integer.toString(a));
        int answer = Math.max(left, right);
        return answer;
    }

    // 수 조작하기 1
    // https://school.programmers.co.kr/learn/courses/30/lessons/181926
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

    // 마지막 두 원소
    // https://school.programmers.co.kr/learn/courses/30/lessons/181927
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

    // 이어 붙인 수
    // https://school.programmers.co.kr/learn/courses/30/lessons/181928
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

    // 주사위 게임 2
    // https://school.programmers.co.kr/learn/courses/30/lessons/181930
    public int solution(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return 27 * ((int) Math.pow(a, 6));
        } else if (a == b || b == c || a == c) {
            return (a + b + c) * (((int) Math.pow(a, 2)) + ((int) Math.pow(b, 2)) + ((int) Math.pow(c, 2)));
        } else {
            return (a + b + c);
        }

    }

    // 등차수열의 특정한 항만 더하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/181931
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

    // 조건 문자열
    // https://school.programmers.co.kr/learn/courses/30/lessons/181934
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                if (n >= m) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                if (n > m) {
                    return 1;
                } else {
                    return 0;
                }
            }
        } else {
            if (eq.equals("=")) {
                if (n <= m) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                if (n < m) {
                    return 1;
                } else {
                    return 0;
                }
            }

        }
    }

    // 두 수의 연산값 비교하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/181938
    public int solution(int a, int b) {
        String num = Integer.toString(a) + Integer.toString(b);
        int answer = Math.max(Integer.valueOf(num), 2 * a * b);
        return answer;
    }

    // 콜라츠 수열 만들기
    // https://school.programmers.co.kr/learn/courses/30/lessons/181919
    public int calc(int x) {
        if (x % 2 == 0) {
            int ans = x / 2;
            return ans;
        } else {
            return x * 3 + 1;
        }
    }

    public int[] solution(int n) {
        String answer_str = Integer.toString(n);

        while (n != 1) {
            n = calc(n);
            answer_str += "," + Integer.toString(n);
        }
        String[] answer_list = answer_str.split(",");
        int[] answer = new int[answer_list.length];

        for (int index = 0; index < answer.length; index++) {
            answer[index] = Integer.valueOf(answer_list[index]);
        }

        return answer;
    }

    // 배열 만들기 4
    // https://school.programmers.co.kr/learn/courses/30/lessons/181918?language=java
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        LinkedList<Integer> answer = new LinkedList<Integer>();
        answer.addLast(arr[arr.length - 1]);
        for (int index = arr.length - 2; index >= 0; index--) {
            if (arr[index] < answer.get(0)) {
                answer.addFirst(arr[index]);
            }
        }
        int[] stk = new int[answer.size()];
        for (int index = 0; index < answer.size(); index++) {
            stk[index] = answer.get(index);
        }
        return stk;
    }

    // 9로 나눈 나머지
    // https://school.programmers.co.kr/learn/courses/30/lessons/181914?language=java

    public int solution(String number) {
        int sum_ = 0;

        for (int index = 0; index < number.length(); index++) {
            sum_ += Character.getNumericValue(number.charAt(index));
        }
        int answer = sum_ % 9;
        return answer;
    }
}
