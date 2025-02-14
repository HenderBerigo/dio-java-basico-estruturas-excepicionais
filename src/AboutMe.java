import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.print("Digite seu nome: ");
            String nome = scan.nextLine();
    
            System.out.print("Digite seu sobrenome");
            String sobrenome = scan.nextLine();
    
            System.out.println("Digite sua idade");
            int idade = scan.nextInt();
            
                System.out.println("Digite sua altura");
                double altura = scan.nextDouble();
                
                
                System.out.println("Digite seu peso");
                double peso = scan.nextDouble();
                
                
                System.out.println("--------");
                System.out.println();
                System.out.println("Olá "+nome+" "+ sobrenome+", sua idade é "+idade+" anos, sua altura é de "+altura+"m e seu peso é de "+peso+"kg.");
                
                
                scan.close();
            } catch (InputMismatchException e) {
                
                System.out.println("Os campos idade, altura e peso, devem ser numéricos.");
            }
        
    }
}
