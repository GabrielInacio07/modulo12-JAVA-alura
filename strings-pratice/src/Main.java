import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Ex05");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = input.nextLine();

        System.out.print("Digite um palavra para buscar: ");
        String palavra = input.nextLine();

        if(texto.trim().isEmpty() || palavra.trim().isEmpty()){
            System.out.println("Nenhum campo pode estar vazio");
        }else if(texto.toLowerCase().contains(palavra.toLowerCase())){
            System.out.printf("A palavra: %s está presente no texto",palavra);
        }else{
            System.out.println("A palavra não está presente no texto!!");
        }

        input.close();
    }
}