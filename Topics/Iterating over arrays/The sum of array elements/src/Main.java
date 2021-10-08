import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementCount = scanner.nextInt();
        int res = 0;
        int[] numbers = new int[elementCount];
        for (int i = 0; i < elementCount; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i : numbers) {
            res += i;
        }
        System.out.println(res);
    }
}