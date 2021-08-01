public class Task9 {
    public void fillDiagonal() {
        int [][] arr = new int [10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i > j) {
                    System.out.print("_");
                } else if (i < j) {
                    System.out.print("_");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
