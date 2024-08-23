public class Array02 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for(int i = 2 ; i< array.length ; i++){
            for(int j = 1; j <array[i].length ; j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }

        }

    }

}
