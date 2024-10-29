import java.util.List;
import java.util.Arrays;

public class Desafio_10 {
    public static void main(String[] args) {
        //Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().filter(num -> num % 2 != 0 && num % 3 == 0 || num % 5 == 0).forEach(System.out::println);
    }
}
