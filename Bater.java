public class Bater {
    public static void main(String... args) {

        int n = 5;
        int m = 5;
        int arr[][] = new int[n][m];


        for (int i = 0; i < arr.length; i++) {//
            for (int j = 0; j < arr[i].length; j++) {
                //System.out.print(arr[i][j] + "\t");
                if(i<=j&&j<arr[i].length-i||i==arr[i].length-1||i>=arr[i].length-i&&j<=i&&j>=arr[i].length-i-1) {
                    arr[i][j] = 1;
                }
            }
        }

            System.out.println();
            for(int i = 0;i<arr.length;i++)
    {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + "\t");
        }
        System.out.println();


    }
}
        }
