public class Functions {

    public static void main(String[] args) {
        // in java we don't call it much function, but method
        // Functions = a block of code which only runs when it is called
        // You can pass data, known as parameters, into a function
        // A function can return data as a result

        String nameOriginal = "John Doe";
        saudation(nameOriginal);

        // new for a sum
        int result = sum(2,3);
    System.out.println(result);
    }

    public static void saudation(String Parametername) {
        System.out.println("Hello" + Parametername);
    }

    public static int sum(int a, int b) {
      return a + b;
    }


}