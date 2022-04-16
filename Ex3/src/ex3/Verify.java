package ex3;
public class Verify {
    public void Tabuada(int n1, int n2) {
        for (int i = 0; i != 11; i++) {
            System.out.print(n1 + " x " + i + " = " + n1 * i + "|");
        }
        System.out.println();
        for (int i = 0; i != 11; i++) {
            System.out.print(n2 + " x " + i + " = " + n2 * i + "|");
        }
    }
    public void Pa(int n1, int n2) {
        int inicial, razao, tpa;
        inicial = n1;
        razao = n2;
        tpa = inicial;
        while (tpa != 0) {
            System.out.println(tpa);
            tpa = tpa + razao;
        }
    }
    public void Pg(int n1, int n2) {
        int inicial, razao, tpg;
        inicial = n1;
        razao = n2;
        tpg = inicial;
        while (tpg != 0) {
            System.out.println(tpg);
            tpg = tpg * razao;
        }
    }
}