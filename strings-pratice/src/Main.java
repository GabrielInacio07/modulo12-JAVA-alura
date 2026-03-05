import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Ex02");

        Scanner input =  new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = input.nextLine();

        String maiusculo = texto.toUpperCase();
        String minusculo = texto.toLowerCase();

        if(texto.trim().isEmpty()){
            System.out.println("Texto não pode ser vázio");
        }else{
            System.out.println("Texto em maiúsculas: " + maiusculo);
            System.out.println("Texto em minúsculas: " + minusculo);
        }


        input.close();
    }
}