import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int boxDimension = 3;
        int[] box1 = new int[boxDimension];
        int[] box2 = new int[boxDimension];
        boolean res1 = true;
        boolean res2 = true;

        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);

        //System.out.println(Arrays.toString(box1));
        //System.out.println(Arrays.toString(box2));

        for (int i = 0; i < boxDimension; i++) {
            res1 = box1[i] < box2[i] && res1;
            res2 = box2[i] < box1[i] && res2;
        }

        //System.out.println(res1);
        //System.out.println(res2);

        if (res1 && res2) {
            System.out.println("Incompatible");
        } else if (res1) {
            System.out.println("Box 1 < Box 2");
        } else if (res2) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}