import java.util.List;
import java.util.OptionalInt;
import java.util.Arrays;

public class Desafio_14 {
    public static void main(String[] args) {
        //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalInt maiorPrimo = numeros.stream().filter(Desafio_14::ehPrimo).mapToInt(Integer::intValue).max();

        System.out.println((maiorPrimo.isPresent()) ? "O maior número primo é: "+maiorPrimo.getAsInt() : "Não há nenhum número primo na lista");
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
