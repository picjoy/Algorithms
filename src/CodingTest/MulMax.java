package CodingTest;


class MulMax {

    // 아래 solution 메서드의 내용을 작성하여 프로그램을 완성해 주세요.
    public void solution(int[] a) {




        // 정수의 최솟값을 최댓값으로 지정
        int max = Integer.MIN_VALUE;
        // 최
        int max_i = -1;
        int max_j = -1;

        // 곱해서 값 계산하기
        if (a.length <= 10) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    // 두 수의 곱이 현재값보다 크면 최댓값으로 넣음
                    if (max < a[i] * a[j]) {
                        max = a[i] * a[j];
                        max_i = i;
                        max_j = j;
                    }
                }
            }
            System.out.println(a[max_i]+", "+a[max_j]);
        } else {
            System.out.println("배열의 요소의 개수가 10개가 넘습니다.");
        }




    }

    public static void main(String[] args) throws Exception {
        // 입력 배열
        int[] a = {4, -6, 3, 2, -7};
        MulMax pg = new MulMax();
        pg.solution(a);

        int[] b = {3,8,-2,-4,7,-9};
        pg.solution(b);

        int[] c = {-6, 8, 9 , 5, -1, -10, -4, -5};
        pg.solution(c);

        int[] d = {1,2,3,4,5,6,7,8,9,10};
        pg.solution(d);

        int[] e = {1,2,3,4,5,6,7,8,9,10,11};
        pg.solution(e);


    }
}