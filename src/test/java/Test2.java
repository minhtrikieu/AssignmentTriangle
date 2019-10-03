import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Enter 3 dimensions of the triangle \n");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        for (int index = 0; index < 3; index++) {
            System.out.println("Enter index " + (index + 1) + " \n");
            if (index == 0) {
                a = scanner.nextInt();
            } else if (index == 1) {
                b = scanner.nextInt();
            } else if (index == 2) {
                c = scanner.nextInt();
            }
        }
        Processing triangle = new Processing(a, b, c);
        if (triangle.checkTriangle() == true) {
            triangle.triangle();
        } else {
            System.out.println("Error triangle");
        }
    }
    /*
    public int addNumber(int a,int b){
        return a+b;
    }*/
}