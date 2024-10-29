import java.util.Arrays;
import java.util.List;

public class Desafio_02 {
    public static void main(String[] args) {
        //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("A soma dos números é: "+numeros.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum));
    }
}
