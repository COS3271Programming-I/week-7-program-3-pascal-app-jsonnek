// Jonathan Sonnek
// March 6th 2026
// Pascal's Triangle App

public class Main {
    public static void main(String[] args) {
        int size = 11;
        int[][] triangle = new int[size][size];

        triangle[0][0] = 1;

        for (int row = 1; row < size; row++) {
            for (int col = 0; col <= row; col++) {
                int above = triangle[row - 1][col];
                int aboveLeft = (col > 0) ? triangle[row - 1][col - 1] : 0;
                triangle[row][col] = above + aboveLeft;
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(triangle[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
