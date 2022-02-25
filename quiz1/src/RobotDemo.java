import java.util.Random;
import java.util.Scanner;

public class RobotDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Robot
        System.out.println("Type in ID for first robot:");
        int id1 = scanner.nextInt();
        Robot r1 = new Robot(id1);
        System.out.println("Type in ID for second robot:");
        int id2 = scanner.nextInt();
        Robot r2 = new Robot(id2);
        System.out.println("Type in ID for third robot:");
        int id3 = scanner.nextInt();
        Robot r3 = new Robot(id3);

        int iterations = -1;
        while (iterations < 0 || iterations > 10) {
            System.out.println("Type in iteration number between 0-10:");
            iterations = scanner.nextInt();
        }

        Random random = new Random();
        for (int i = 0; i < iterations; i++) {
            Robot.Direction randomDir1 = Robot.Direction.values()[random.nextInt(Robot.Direction.values().length)];
            r1.setDir(randomDir1);
            r1.advance();
            Robot.Direction randomDir2 = Robot.Direction.values()[random.nextInt(Robot.Direction.values().length)];
            r2.setDir(randomDir2);
            r2.advance();
            Robot.Direction randomDir3 = Robot.Direction.values()[random.nextInt(Robot.Direction.values().length)];
            r3.setDir(randomDir3);
            r3.advance();
        }

        r1.display();
        r2.display();
        r3.display();

        // RobotNGs
        System.out.println("Type in ID for first robotNG:");
        int idNG1 = scanner.nextInt();
        RobotNGs rNG1 = new RobotNGs(idNG1);
        System.out.println("Type in ID for second robotNG:");
        int idNG2 = scanner.nextInt();
        RobotNGs rNG2 = new RobotNGs(idNG2);
        System.out.println("Type in ID for third robotNG:");
        int idNG3 = scanner.nextInt();
        RobotNGs rNG3 = new RobotNGs(idNG3);

        int iterationsNG = -1;
        while (iterationsNG < 0 || iterationsNG > 10) {
            System.out.println("Type in iteration number for NG between 0-10:");
            iterationsNG = scanner.nextInt();
        }

        for (int i = 0; i < iterationsNG; i++) {
            Robot.Direction randomDir1 = Robot.Direction.values()[random.nextInt(Robot.Direction.values().length)];
            rNG1.setDir(randomDir1);
            System.out.println(randomDir1);
            rNG1.advance();
            Robot.Direction randomDir2 = Robot.Direction.values()[random.nextInt(Robot.Direction.values().length)];
            rNG2.setDir(randomDir2);
            System.out.println(randomDir2);
            rNG2.advance();
            Robot.Direction randomDir3 = Robot.Direction.values()[random.nextInt(Robot.Direction.values().length)];
            rNG3.setDir(randomDir3);
            System.out.println(randomDir3);
            rNG3.advance();
        }

        rNG1.display();
        rNG2.display();
        rNG3.display();
    }
}
