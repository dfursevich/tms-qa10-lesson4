import java.util.Random;

public class Run {
    public static void main(String[] args) {
        int[][] ar = new int[4][4];
        Random r = new Random();

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = r.nextInt(10);
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i == j) {
                    if (ar[i][j] < min) {
                        min = ar[i][j];
                    }
                }
            }
        }
        System.out.println("min = " + min);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i][i] + " ");
        }

        System.out.println();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i == ar[i].length - j - 1) {
                    if (ar[i][j] > max) {
                        max = ar[i][j];
                    }
                }
            }
        }
        System.out.println("max = " + max);
    }
}
