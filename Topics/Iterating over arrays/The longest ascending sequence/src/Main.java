import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] numbers = new int[cnt];
        int res = 0;
        int resTmp = 0;
        int prev = 0;

        for (int i = 0; i < cnt; i++) {
            numbers[i] = scanner.nextInt();
            prev = i == 0 ? numbers[i] : prev;
            if (prev <= numbers[i]) {
                resTmp++;
                res = res < resTmp ? resTmp : res;
            } else {
                resTmp = 1;
            }
            prev = numbers[i];
        }
        System.out.println(res);
    }
}