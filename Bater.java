import java.util.Random;
import java.util.Scanner;

public class Bater {
    public static void main(String... args) {

        int n = 5;
        int m = 5;
        int arr[][] = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == 0 || i == m - 1) {
                    arr[i][j] = 1;
                    }
               else if((i==1||i==n-2)&&(j>=1&&j<=m-2)){
                   arr[i][j]=1;}
                   else if((i==2||i==n-3)&&(j>=2&&j<=m-3)){
                       arr[i][j]=1;}
                }
        }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
              System.out.print(arr[i][j] + "\t");
                }
                System.out.println();

        }
    }
}


