import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                if(i >= j) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}