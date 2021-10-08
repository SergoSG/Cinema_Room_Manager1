import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String homeName = scanner.next();
        if ("gryffindor".equals(homeName)) {
            System.out.println("bravery");
        } else if ("hufflepuff".equals(homeName)) {
            System.out.println("loyalty");
        } else if ("slytherin".equals(homeName)) {
            System.out.println("cunning");
        } else if ("ravenclaw".equals(homeName)) {
            System.out.println("intellect");
        } else {
            System.out.println("not a valid house");
        }
    }
}