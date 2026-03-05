import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Ex01");

        Scanner input =  new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        String nameNoSpace = nome.trim();

        System.out.println("Nome original: [" + nome + "]");
        System.out.println("Nome sem espaços: [" + nameNoSpace + "]");
        input.close();
    }
}