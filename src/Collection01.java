import java.util.ArrayList;
import java.util.Scanner;

public class Collection01 {
    public static void main(String[] args) {
        // 콘솔 입력을 받기 위한 Scanner 객체를 선언합니다.
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("도시 목록을 입력합니다.");

        while (true) {
            String city = scan.nextLine();
            if (city.equals("exit")) {
                break;
            }
            if (!arrayList.contains(city)) {
                arrayList.add(city);
            }

        }
        System.out.println("도시의 개수 : "+ arrayList.size());
        if(arrayList.isEmpty()){
            System.out.println("도시 목록이 비어있습니다.");
        }else {
            for(int i = arrayList.size()-1;i>=0 ; i--){
                System.out.println(arrayList.get(i));
            }
        }
    }
}
