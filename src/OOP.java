import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {


//        String name = "HELLO";
//        String message = "Hello";
//
////        System.out.println(name.length());
////        System.out.println(name.toUpperCase());
////        System.out.println(name.trim());
////        System.out.println(name.concat(" Samir"));
//
//        int score = 100;
//
//        System.out.println("The score is " + score);


        inputAndOutput();
    }

    private static void inputAndOutput(){


        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the student degree:");
        int degree = scn.nextInt();

        if(degree > 90){
            System.out.println("A");
        }else if(degree > 80) {
            System.out.println("B");
        }else{
            System.out.println("Not Applicable!");
        }

    }
}

class Car{

    String name;
    String color;

    int speed;

    public Car(String name,  String color, int speed){
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public void drive(){
        System.out.println("From drive method " + this.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}