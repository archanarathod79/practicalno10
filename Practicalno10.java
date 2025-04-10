import java.util.*;

public class Practicalno10 {
    private static final int SIZE = 3;

    // Method to generate a shuffled 3x3 Sudoku box
    public static int[][] generateBox() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        int[][] box = new int[SIZE][SIZE];
        int index = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                box[i][j] = numbers.get(index++);
            }
        }

        return box;
    }

    // Method to print a 3x3 box
    public static void printBox(int[][] box) {
        System.out.println("|____|____|____|");  // Top line

        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf(" %2d |", box[i][j]);
            }
            System.out.println();
            System.out.println("|____|____|____|");
        }
    }

    public static void main(String[] args) {
        // Generate three separate boxes
        int[][] box1 = generateBox();
        int[][] box2 = generateBox();
        int[][] box3 = generateBox();

        // Display each box
        System.out.println("First 3x3 Sudoku Box:");
        printBox(box1);

        System.out.println("\nSecond 3x3 Sudoku Box:");
        printBox(box2);

        System.out.println("\nThird 3x3 Sudoku Box:");
        printBox(box3);
    }
}
