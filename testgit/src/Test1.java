import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp a");
        double a = scanner.nextInt();
        System.out.println("Nhâp b");
        double b = scanner.nextInt();
        System.out.println("Nhâp c");
        double c = scanner.nextInt();
        ptb2(a, b, c);
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("Phương trình vô số nghiệm");
//            } else {
//                System.out.println("Phương trình vô nghiệm");
//            }
//        } else {
//            if (b == 0) {
//                System.out.println("Phương trình có nghiệ : 0");
//                return;
//            }
//
//            double result = -b / a;
//            System.out.println("phương trình có nghiệm : " + result);
//        }

    }

    static void ptb2(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            double delta = b * b - (4 * a * c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (a * 2);
                double x2 = (-b - Math.sqrt(delta)) / (a * 2);
                System.out.println("phương trình có nghiệm : " + x1 + " " + x2);
            } else {
                double x = -b / (2 * a);
                System.out.println("phương trình có nghiệm kép : " + x);
            }

        }

    }

}
