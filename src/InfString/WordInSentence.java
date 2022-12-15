package InfString;

import java.util.Scanner;

public class WordInSentence {

    public static String solution(String str){

        String answer = "";

        // 가장 긴 단어를 찾아야되니 처음에 최소값으로 초기화
        int max = Integer.MIN_VALUE, pos;

        /*
        // 01. split를 사용해보자!
        // 띄어쓰기로 분리해서 String 배열로 저장하는 것 => split
        String[] s = str.split(" ");

        for (String x : s){
            // 최대 길이 구하기
            int len = x.length();

            // 더 긴 단어 발견!
            if (len > max){
                // 최대값 단어 변경
                max = len;
                // 길이가 긴 단어를 넣기
               answer = x;
            }
        }
        */

        // 02. indexOf랑 substring을 사용해보자 => 인덱스 번호를 리턴해줌
        while ((pos = str.indexOf(' '))!= -1){  // 띄어쓰기 발견 못하면 -1을 리턴
            // 그런데 발견하면 그 인덱스 번호를 리턴해줌

            // substring(int beginIndex, int endIndex) => beginIndex부터 endIndex-1까지 잘라냄
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if (len > max){
                max = len;
                answer = tmp;
            }
            // substring(int beginIndex) => beginIndex부터 끝까지
            str = str.substring(pos+1);

        }

        // 마지막 단어까지 체크해주기!
        if (str.length() > max)
            answer = str;



        return answer;
    }

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        // 단어가 아닌 한 줄로 입력받으므로 nextLine()으로 받음
        String input = scanner.nextLine();

        System.out.println(solution(input));

    }
}
