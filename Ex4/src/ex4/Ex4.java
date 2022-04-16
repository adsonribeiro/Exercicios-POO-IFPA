package ex4;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
    int n1,n2,n3 = 0;
    Scanner ler = new Scanner(System.in);
    Poligono obj = new Poligono();
        System.out.print("L1: ");
        n1 = ler.nextInt();
        System.out.print("L2: ");
        n2 = ler.nextInt();
        System.out.print("L3: ");
        n3 = ler.nextInt();
        obj.etriangulo(n1, n2, n3);
        obj.Isoceles(n1, n2, n3);
        obj.Escaleno(n1, n2, n3);
        obj.Equilatero(n1, n2, n3);
    }
}