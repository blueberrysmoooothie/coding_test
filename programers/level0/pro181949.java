
// 대소문자 바꿔서 출력하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181949
import java.util.Scanner;

public class pro181949 {
    public void solution(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String new_a = "";
        for (int index = 0; index < a.length(); index++) {
            new_a += changeChar(a.charAt(index));
        }
        System.out.println(new_a);

    }

    private static char changeChar(char alp) {
        if (Character.isUpperCase(alp)) {
            return Character.toLowerCase(alp);
        } else {
            return Character.toUpperCase(alp);
        }
    }
}