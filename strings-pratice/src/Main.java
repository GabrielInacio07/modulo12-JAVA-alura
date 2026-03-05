import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Ex03");

        Scanner input =  new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = input.nextLine();

        System.out.println("Texto: " + texto);

        System.out.print("Digite a palavra a ser substituída: ");
        String substituida = input.nextLine();

        if (substituida.trim().isEmpty()) {
            System.out.println("Palavra inválida!");

        }else if (texto.toLowerCase().contains(substituida.toLowerCase()))  {
            System.out.print("Digite a nova palavra: ");
            String novaPalavra = input.nextLine();

            String textoModificado = texto.replaceAll("(?i)" +substituida, novaPalavra);
            System.out.println("Texto modificado: " + textoModificado);
        } else {
            System.out.println("Palavra não encontrada!");
        }

        input.close();
    }
}