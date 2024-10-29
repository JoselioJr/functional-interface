import java.util.Arrays;
import java.util.List;

public class Desafio_03 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Lista: ");
        numeros.stream().forEach(System.out::println);
        System.out.println("\n'true' se todos os números forem positivos ou 'false' se há pelo menos 1 número negativo: "+numeros.stream().allMatch(num -> num % 2 == 0));
    }
}
