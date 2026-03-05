import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Ex04");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String arquivo = input.nextLine();

        if (arquivo.trim().isEmpty()) {
            System.out.println("Nome inválido!");
            return;
        }

        int indicePonto = arquivo.lastIndexOf(".");

        if (indicePonto == -1) {
            System.out.println("Arquivo não possui extensão.");
        } else {
            String nomeSemExtensao = arquivo.substring(0, indicePonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        }

        input.close();
    }
}