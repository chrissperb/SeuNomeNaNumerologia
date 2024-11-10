import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.nextLine().toUpperCase();

        int numeroNome = Service.calcularNumeroNome(nome);
        String mensagemNome = Service.criaMensagemNome(numeroNome);
        System.out.println("O número do seu nome é: " + numeroNome);
        System.out.println("O seu nome esta relacionado com: " + mensagemNome);
    }
}
