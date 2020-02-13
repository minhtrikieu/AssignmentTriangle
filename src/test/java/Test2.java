import java.util.Scanner;
import java.util.logging.Logger;

public class Test2 {
    private static final Logger logger = Logger.getLogger(Test2.class.getName());
    public static void main(String[] args) {
        logger.info("Enter 3 dimensions of the triangle \n");
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
       if (triangle.checkTriangle()) {
           logger.info(triangle.triangle());
     } else {
         logger.info("Error triangle");
       }
    }

}