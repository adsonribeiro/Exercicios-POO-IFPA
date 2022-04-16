package ex2;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Repeticao obj = new Repeticao();
        int n1,n2 = 0;
        System.out.print("digite um valor para n1: ");
        n1 = ler.nextInt();
        System.out.print("digite um valor para n2: ");
        n2 = ler.nextInt();
        obj.crescente(n1, n2);
        System.out.println();
        System.out.println("-----------------------");
        obj.decrescente(n1, n2);
    }
}