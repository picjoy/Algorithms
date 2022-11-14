package InfString;

import java.util.Scanner;

public class CaseConversion {
    //대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


    public static String solution(String str){
        String result = "";

/*
        for (char c : str.toCharArray()){
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else
                result += Character.toUpperCase(c);
        }
*/

        // 아스키코드값으로 풀어보기
        // 대문자 : 65 ~ 90
        // 소문자 : 97 ~ 122

        for (char c : str.toCharArray()){
            if (c >= 65 && c <= 90)
                result += (char)(c+32);
            else
                result += (char)(c-32);
        }


        return result;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(solution(str));

    }
}
