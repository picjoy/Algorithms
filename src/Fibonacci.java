public class Fibonacci {

    public static void main(String[] args) {
        int n = 5;
        int answer = fibo(n);
        System.out.println(answer);
    }
    public static int fibo(int n){
        int[] num = new int[n+1];

        num[0] = 0;
        num[1] = 1;

        for (int i =2; i <= n; i++){
            num[i] = (num[i-1]+num[i-2])% 1234567;
        }

        return num[n];
    }


}
