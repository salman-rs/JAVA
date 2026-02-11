package faris;
import java.util.Scanner;
public class symmetricmetrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;

        // Check only upper triangle
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i][j] != A[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) {
                break;  // Exit outer loop as well
            }
        }

        if (symmetric) {
            System.out.println("The matrix is Symmetric.");
        } else {
            System.out.println("The matrix is NOT Symmetric.");
        }

        sc.close();
    }


	}


