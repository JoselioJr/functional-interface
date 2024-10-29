import java.util.List;
import java.util.Arrays;

public class Desafio_12 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().reduce(1, (num1, num2) -> num1 * num2));
    }
}
