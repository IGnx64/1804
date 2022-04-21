import java.util.Scanner;

class Sum {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число A = ");
        int a = scan.nextInt();
        System.out.print("Введите второе число B = ");
        int b = scan.nextInt();
        System.out.print("Введите третье число C = ");
        int c = scan.nextInt();
        System.out.println("A + B + C = " + ( a + b + c ));
    }
}