import java.util.Scanner;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cepFormatado = scan.nextLine();
        try {
            cepFormatado = formatarCep(cepFormatado);
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP deve ter 8 dígitos.");
        }
    scan.close();
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
        throw new CepInvalidoException();

        return "Cep correto";
    }
    
}
