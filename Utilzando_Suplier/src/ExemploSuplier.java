import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ExemploSuplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a mesagem: ");
        String mensagem = scan.nextLine();

        System.out.print("Digite a quantidade de vezes que será duplicada a mensagem: ");
        int quantidade = scan.nextInt();

        List<String> listaSuplier = Stream.generate(() -> mensagem).limit(quantidade).toList();

        listaSuplier.forEach(System.out::println);
    }
}
