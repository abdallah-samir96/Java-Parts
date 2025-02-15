public class Loops {
    public static void main(String[] args) {

        // while loop
//        byte count = 0;
//
//        while(count < 5) {
//            System.out.println("Hello Java");
//            ++count;
//        }
//        System.out.println("After while loop");



//        byte count = 10;
//        System.out.println(10 < 5);
//
//        do{
//            System.out.println("Hello from do while");
//            count++;
//        } while (count < 5);



//        for(byte count = 1; count <= 10; ++count) {
//            System.out.println(count * 2);
//        }


        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }



    }
}
