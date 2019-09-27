import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Shape Test ");
            System.out.println("2. Triangle Test ");
            System.out.println("0. Exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    ShapeTest();
                    break;
                case 2:
                    TriangleTest();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("just input 0 to 4.");
                    break;
            }
        }
    }

    public static void ShapeTest(){
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("white",false);
        System.out.println(shape);
    }

    public static void TriangleTest(){
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle("red",true,1.0d,3.0d,5.0d);
        System.out.println(triangle);
    }
}
