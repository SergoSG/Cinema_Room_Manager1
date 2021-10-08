import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int ticketCost = scanner.nextInt();
        int hotelCost = scanner.nextInt();

        System.out.println(duration * foodCost + ticketCost * 2 + hotelCost * (duration - 1));
    }
}