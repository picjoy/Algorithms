package InfString;

import java.util.Scanner;

public class FindChar {

    //한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
    //대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

    public int solution(String str, char input) {

        int result = 0;

        // 대소문자를 구분하지 않으니 대문자로 처리하기
        str = str.toUpperCase();
        input = Character.toUpperCase(input);

/*
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == input){
                result++;
            }
        }
*/
        // 향상된 for문 사용하기
        // 향상된 for문에서 올 수 있는 것 -> Array, ArrayList
        // toCharArray() -> String을 문자 배열로 만들어 주는 것
        for (char c : str.toCharArray()){
            if (c == input)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {

        FindChar result = new FindChar();
        Scanner scanner = new Scanner(System.in);

        // 문자열 받기
        String str = scanner.next();

        // 문자 받기
        // charAt() -> String을 인덱스로 접근하는 것
        char input = scanner.next().charAt(0);

        System.out.println(result.solution(str,input));


    }



}
