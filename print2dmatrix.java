import java.util.Scanner;

public class print2dmatrix {
    public static void main(String[] args) {
        int i, j;
        int[][] a = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array elements:");

        // Input matrix elements
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nYour 2D matrix:");

        // Print matrix elements
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }

        sc.close(); // Close the scanner
    }
}
