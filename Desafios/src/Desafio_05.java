import java.util.Arrays;
import java.util.List;

public class Desafio_05 {
    public static void main(String[] args) {
        //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream().filter(num -> num > 5).reduce(0, Integer::sum);

        double media = (double) soma / numeros.stream().filter(num -> num > 5).count();

        System.out.println("A média é: "+media);
    }
}
