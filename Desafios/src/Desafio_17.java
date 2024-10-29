import java.util.Arrays;
import java.util.List;

public class Desafio_17 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream().filter(Desafio_17::ehPrimo).map(Integer::intValue).toList();

        System.out.println("Números Primos: "+numerosPrimos);
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
