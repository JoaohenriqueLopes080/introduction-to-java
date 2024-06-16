import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        // arrays = putting everything in one
        //int[] // numbers = {1, 2, 3, 4, 5};

        int[] numbers = new int[5];
        // it has 5 positions
        // [0] [1] [2] [3] [4]
        // new to define its position we do it like
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers); // print an element of memory, but its not this that we want.
        // to print the numbers we do it like
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // now for letters but using String
        String[] letters = new String[5];
        letters[0] = "A";
        letters[1] = "B";
        letters[2] = "C";
        letters[3] = "D";
        letters[4] = "E";
        for (int i=0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        // now for syntax to send all the values directly into the array

        String[] letters2 = {"A", "B", "C", "D", "E"};
        for (int j=0; j < letters2.length; j++) {
            System.out.println(letters2[j]);

        }

        System.out.println(Arrays.toString(letters2));

        // how can i discover which is the higher element in my array

        int[] numbers2 = {1, 2, 3, 4, 5};
        int higher = numbers2[0];
        int medium = 0;
        int lower = numbers2[0];

        for(int i=0; i < numbers2.length; i++) {
            if (numbers2[i] > higher) {
                higher = numbers2[i];
            }
            if (numbers2[i] < lower) {
                lower = numbers2[i];
            }
            medium += numbers2[i];
        }
        // printing the values
        System.out.println("The higher number is: " + higher);
        System.out.println("The lower number is: " + lower);
        System.out.println("The medium number is: " + medium/numbers2.length);

    }
}
