import java.util.*;

class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        if (string == null) {
            System.out.println("NPE!");
            return;
        }
        /* Do not change code above */

        System.out.println(string.toLowerCase());
    }
}