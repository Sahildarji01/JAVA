import java.util.*;

public class Matrices {
    public static void main(String[] args) {
        int matrix[][] = new int[4][3];
        int n = 4, m = 3;
        
        Scanner Sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = Sc.nextInt();
            }
        }

     ///output 
     for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
           System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    }
}
