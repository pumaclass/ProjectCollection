public class Iteration03 {
    public static void main(String[] args) {
        // 야근한 날을 계산하기 위해 변수를 선언합니다.
        int overworkDays = 0;
        int workDay = 0;
        while (Math.random() < 0.8) {
            if (true) {
                overworkDays++;

                if (overworkDays == 10) {
                    break;
                }
            }
        }
        System.out.printf("보셨나요? 저의 %d일 연속 야근!", overworkDays);
    }
}
