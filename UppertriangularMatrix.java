package uppertriangular;

import java.util.Arrays;
import java.util.Scanner;

public class UppertriangularMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size:");
        int size=in.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j]=(int)(Math.random()*10)+1;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j<i){
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i < size; i++) {


            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
