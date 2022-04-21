package ex6;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        VP obj = new VP();
        System.out.print("N1: ");
        int n1 = ler.nextInt();
        obj.ePrimo(n1);
    }
}
