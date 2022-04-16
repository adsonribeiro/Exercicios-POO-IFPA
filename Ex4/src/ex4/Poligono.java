package ex4;
public class Poligono {
 public void etriangulo(int n1, int n2, int n3){
        if ((n1<n2+n3)||(n2<n1+n3)||(n3<n1+n2)){
            System.out.println("é triangulo");
        }
    }
    public void Isoceles(int n1, int n2, int n3){
        if ((n1!=n2 && n1!=n3 && n2==n3)||(n2!=n1 && n2!=n3 && n1==n3)||(n3!=n1 && n3!=n2 && n1==n2)){
            System.out.println("Tringulo Isoceles");
        }
    }
    public void Escaleno(int n1, int n2, int n3){
        if ((n1!=n2 && n1!=n3)&&(n2!=n1 && n2!=n3)&&(n3!=n1 && n3!=n2)){
            System.out.println("Tringulo Escaleno");
        }
    }
    public void Equilatero(int n1, int n2, int n3){
        if ((n1==n2 && n1==n3)&&(n2==n1 && n2==n3)&&(n3==n1 && n3==n2)){
            System.out.println("Tringulo Equilatero");
        }
    }
}
