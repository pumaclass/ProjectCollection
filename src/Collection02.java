import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection02 {
    public static void main(String[] args) {
        // 콘솔 입력을 받기 위한 Scanner 객체를 선언합니다.
        Scanner scan = new Scanner(System.in);
        Set<String> hashList = new HashSet<>();

        System.out.println("도시 목록을 입력합니다.");

        while (true) {
            String city = scan.nextLine();
            if (city.equals("exit")) {
                break;
            }
            hashList.add(city);
        }
            hashList.remove("평양");
        System.out.println("도시의 개수 : " + hashList.size());
        if(hashList.isEmpty()){
            System.out.println("도시 목록이 비어있습니다.");
        }else {
            System.out.println(hashList.toString());
        }
    }
}