public class Iteration01 {
    public static void main(String[] args) {
        int a = 0;
        // 3~100까지 랜덤으로 연습할 수 지정합니다.
        int n = (int) ((Math.random() * 98) + 3);
        // 숫자를 어디까지 연습할 지 출력해봅니다.
        System.out.printf("%d까지 3, 6, 9 게임 연습 시작\n", n);
        for (int i = 0; i <= n; i++) {
            if (i % 10 == 0) {
                continue;
                }if(i%3 == 0){
                System.out.println("짝");
            }else{
                System.out.println(i);
            }
        }

    }
}
