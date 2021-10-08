package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rowsCount = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();
        char[][] cinema = new char[rowsCount][seatsPerRow];

        initCinema(cinema, rowsCount, seatsPerRow);
        while (true) {
            switch (showMenu()) {
                case 1:
                    printCinema(cinema);
                    break;
                case 2:
                    buyTicket(cinema);
                    break;
                case 3:
                    showStatistic(cinema);
                    break;
                case 0: return;
            }
        }
    }

    public static void showStatistic(char[][] cinema) {
        int seatsCount = cinema.length * cinema[0].length;
        int rowsCount = cinema.length;
        int seatsPerRow = cinema[0].length;
        final int price1 = 10;
        final int price2 = 8;
        int sellCount = 0;
        int sellSum = 0;

        System.out.println();
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (cinema[i][j] == 'B') {
                    sellCount++;
                    if (seatsCount <= 60) {
                        sellSum += price1;
                    } else {
                        if (i <= cinema.length / 2 - 1) {
                            sellSum += price1;
                        } else {
                            sellSum += price2;
                        }
                    }
                }
            }
        }
        System.out.printf("Number of purchased tickets: %d\n", sellCount);
        System.out.printf("Percentage: %.2f%%\n", (double)sellCount / seatsCount * 100);
        System.out.printf("Current income: $%d\n", sellSum);

        if (seatsCount <= 60) {
            System.out.printf("Total income: $%d\n", seatsCount * price1);
        } else {
            System.out.printf("Total income: $%d\n", rowsCount / 2 * seatsPerRow * price1 +
                    (rowsCount - rowsCount / 2) * seatsPerRow * price2);
        }
    }

    public static void buyTicket(char[][] cinema) {
        Scanner scanner = new Scanner(System.in);
        int rowNumber = 0;
        int seatNumber = 0;
        boolean isContinue = false;

        System.out.println();
        do {
            isContinue = false;
            System.out.println("Enter a row number:");
            rowNumber = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNumber = scanner.nextInt();

            if (rowNumber > cinema.length || seatNumber > cinema[0].length || rowNumber == 0 || seatNumber == 0) {
                System.out.println("Wrong input!");
                isContinue = true;
            } else if (cinema[rowNumber - 1][seatNumber - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
                isContinue = true;
            }
        } while (isContinue);

        int seatsCount = cinema.length * cinema[1].length;
        final int price1 = 10;
        final int price2 = 8;

        if (seatsCount <= 60) {
             System.out.printf("Ticket price: $%d", price1);
        } else {
            if (rowNumber <= cinema.length / 2) {
                System.out.printf("Ticket price: $%d", price1);
            } else {
                System.out.printf("Ticket price: $%d", price2);
           }
        }
        cinema[rowNumber - 1][seatNumber - 1] = 'B';
        System.out.println();
    }

    public static int showMenu() {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void initCinema(char[][] cinema, int rowsCount, int seatsPerRow) {
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                cinema[i][j] =  'S';
            }
        }
    }

    public static void printCinema(char[][] cinema) {
        System.out.println();
        System.out.println("Cinema:");
        for (int i = -1; i < cinema.length; i++) {
            for (int j = -1; j < cinema[i == -1 ? 0 : i].length; j++) {
                if (i == -1) {
                    System.out.printf(j == -1 ? " " : " %d", j + 1);
                } else {
                    if (j == -1) {
                        System.out.print(i + 1);
                    } else {
                        System.out.printf(" %s", cinema[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }

}