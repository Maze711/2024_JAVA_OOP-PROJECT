package javaPLMun;

public class ActivityOne {
    public static void main(String[] args) {
        int height = 9;

        for (int i = 0; i < height; i++) {
            // Printing 'M'
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || (i < height / 2 && (j == i || j == height - 1 - i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Adding space between letters
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            // Printing 'C'
            for (int j = 0; j < 9; j++) {
                if ((i == 0 || i == 8) || (j == 0 && i > 0 && i < 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Adding space between letters
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            // Printing 'B'
            for (int j = 0; j < 9; j++) {
                if (j == 0 || (i == 0 || i == 4 || i == 8) && j < 8 || (j == 8 && (i > 0 && i < 4 || i > 4 && i < 8))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Moving to the next line after printing all three letters
            System.out.println();
        }
    }
}
