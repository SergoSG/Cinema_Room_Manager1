import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementCount = scanner.nextInt();
        int[] elements = new int[elementCount];
        for (int i = 0; i < elementCount; i++) {
            elements[i] = scanner.nextInt();
        }
        int maxNumber = scanner.nextInt();
        int res = 0;
        for (int i : elements) {
            if (i > maxNumber) {
                res += i;
            }
        }
        System.out.println(res);
    }
}