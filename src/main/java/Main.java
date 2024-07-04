import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);

    System.out.println("Digite seu primeiro nome:");
    String nome = sc.next();
    
    System.out.println("");
    
    System.out.println("Digite seu sobrenome:");
    String sobrenome = sc.next();
    
    System.out.println("");
    

    System.out.println("Digite sua idade:");
    String Idade = sc.next();

    System.out.println("");
    
    System.out.println("digite sua altura: ");
    String Altura = sc.next();

    System.out.println("");
    
    System.out.println("digite seu sexo.  1 para feminino e 2 para masculino");
    
    String sexo = sc.next();
    
    System.out.println("");
    
      System.out.println("Olá " + nome + sobrenome);
    
    System.out.println("");

    
    System.out.println("");
    
     
    
    System.out.println("digite sua Altura: ");
   
double altura = sc.nextDouble();

    System.out.println("digite seu peso:");
    double  peso = sc.nextDouble();
    
    double  imc = peso/(altura*altura);
     System.out.printf("Seu peso ideal é : %.2f ", imc);

    


    sc.close();
    }

  
}