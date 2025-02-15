public class Functions {

    public static void main(String[] args) {

        pay(500, "Ahmed Mohamed");



    }

       static int sum(int a1, int b1){
        System.out.println("From sum method");
        return a1 + b1;
    }

    public static void pay(double balance, String name) {
        System.out.println("Hello " + name);
        if(balance >= 1000) {
            balance = balance - 1000;
            System.out.println(balance);
            System.out.println("Success!");
        }else{
            System.out.println("Error");
        }

    }

}
