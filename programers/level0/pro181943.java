// https://school.programmers.co.kr/learn/courses/30/lessons/181943
public class pro181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());
        return answer;
    }
}
