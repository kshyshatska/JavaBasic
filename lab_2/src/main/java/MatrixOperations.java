import java.util.Scanner;
import java.util.Random;

public class MatrixOperations {

    private static final int MAX_SIZE = 20;

    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть висоту матриці (не більше 20): ");
        int rows = getValidInput(scanner);
        System.out.println("Введіть ширину матриці (не більше 20): ");
        int cols = getValidInput(scanner);

        int[][] matrix;

        System.out.println("Оберіть спосіб створення матриці:");
        System.out.println("1 - Ручне введення\n2 - Рандомне створення");
        int choice = getValidChoice(scanner);

        if (choice == 1) {
            matrix = createMatrixManually(scanner, rows, cols);
        } else {
            matrix = createMatrixRandomly(rows, cols);
        }

        System.out.println("Згенерована матриця:");
        printMatrix(matrix);

        int max = findMax(matrix);
        int min = findMin(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Максимальний елемент: " + max);
        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Середнє арифметичне: " + average);
    }

    private static int getValidInput(Scanner scanner) {
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input > 0 && input <= MAX_SIZE) {
                return input;
            }
            System.out.println("Некоректне значення. Введіть число від 1 до " + MAX_SIZE + ":");
        }
    }

    private static int getValidChoice(Scanner scanner) {
        int choice;
        while (true) {
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2) {
                return choice;
            }
            System.out.println("Некоректний вибір. Введіть 1 або 2:");
        }
    }

    private static int[][] createMatrixManually(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }


    private static int[][] createMatrixRandomly(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt((RANDOM_MAX - RANDOM_MIN) + 1) + RANDOM_MIN;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    private static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    private static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }
        return (double) sum / count;
    }
}