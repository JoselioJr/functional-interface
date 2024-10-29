import java.util.List;
import java.util.Arrays;

public class Desafio_11 {
    public static void main(String[] args) {
        //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().map(num -> num * num).reduce(0, Integer::sum));
    }
}
