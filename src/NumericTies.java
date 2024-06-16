public class NumericTies {

    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        // for one variable which start in 1 and go to 10, changing one per one
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // now for which variable with 1 to 10 by multiplying it by I
        for (int i = 1; i <= 10; i++) {
            System.out.println(1 * i);
            System.out.println(2 * i);
            System.out.println(3 * i);
            System.out.println(4 * i);
            System.out.println(5 * i);
            System.out.println(6 * i);
            System.out.println(7 * i);
            System.out.println(8 * i);
            System.out.println(9 * i);
            System.out.println(10 * i);
        }
        // how to make this variation more easy?
        // by making two for  loops
        // for each interation of i there's 10 for j
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j * i);
            }
        }
        // new  making it to show which number is multiplying by who
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf(j + "x" + i + "=" + j * i);
                // now it will print like
                // 1x1 = 1
                // 2x1 = 2
            }
        }

    }
}
