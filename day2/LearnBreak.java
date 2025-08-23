package week1.day2;

public class LearnBreak {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exits the loop when i = 5
            }
            //System.out.println("Outer loop i = " + i);

            // Inner loop
            for (int j = 10; j <= 20; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " is even");
                } else {
                    System.out.println(j + " is odd");
                }
            }
        }
    }
}
