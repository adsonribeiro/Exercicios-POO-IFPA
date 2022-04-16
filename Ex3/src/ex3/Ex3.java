package ex3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        int n1,n2 = 0;
        Scanner ler = new Scanner(System.in);
        Verify obj = new Verify();
        System.out.print("numero para n1: ");
        n1 = ler.nextInt();
        System.out.print("numero para n2: ");
        n2 = ler.nextInt();
        System.out.println();
        obj.Tabuada(n1, n2);
        System.out.println();
        System.out.println();
        System.out.println("----PA----");
        obj.Pa(n1, n2);
        System.out.println("----PG----");
        obj.Pg(n1,n2);
    }
}