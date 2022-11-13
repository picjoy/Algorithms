public class ArithmeticSequence {
    public static void main(String[] args) {

        // 임의의 자연수 n으로 나누었을 때, 그 몫과 나머지가 같아지는 자연수들을 모두 더한 값을 반환하도록 하는 함수를 더하시오
        long n = 3;
        long result = solution(n);

        System.out.println(result);

    }

    public static long solution(long n){

        long answer = 0;

        answer = (n-1)*(n+1+(n+1)*(n-1))/2;

        return answer;
    }

}
