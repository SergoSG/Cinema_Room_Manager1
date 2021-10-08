import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int prev = 0;
        boolean res1 = true;
        boolean res2 = true;

        do {
            i = scanner.nextInt();
            if (prev == 0) {
                prev = i;
            }
            if (prev > i && i != 0) {
                res1 = false;
            }
            if (prev < i && i != 0) {
                res2 = false;
            }
            prev = i;
        } while (i != 0 && (res1 || res2));
        System.out.println(res1 || res2);
    }
}