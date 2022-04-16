package ex5;
public class Inverter {
  public void Contrario(String palavra, String contra){
        for (int i = palavra.length()-1;i>=0;i--){
            contra = contra + palavra.charAt(i);
        }
        System.out.println("palavra invertida:"+contra);
  }  
  public void tamanho(String palavra){
      System.out.println("Número de Caracteres:"+palavra.length());
  }
}
