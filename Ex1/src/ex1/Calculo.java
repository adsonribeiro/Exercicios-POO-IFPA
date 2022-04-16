package ex1;
public class Calculo {
     public void maior(int n1, int n2, int n3){
        if (n1>n2 && n1>n3){
            System.out.println("o maior é: "+n1);
        }
        if (n2>n1 && n2>n3){
            System.out.println("o maior é: "+n2);
        }
        if (n3>n1 && n3>n2){
            System.out.println("o maior é: "+n3);
        }
    }
    public void menor(int n1, int n2, int n3){
        if (n1<n2 && n1<n3){
            System.out.println("o menor é: "+n1);
        }
        if (n2<n1 && n2<n3){
            System.out.println("o menor é: "+n2);
        }
        if (n3<n1 && n3<n2){
            System.out.println("o menor é: "+n3);
        }
    }
}
