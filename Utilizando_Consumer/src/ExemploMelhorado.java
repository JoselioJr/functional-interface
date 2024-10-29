import java.util.Arrays;
import java.util.List;

public class ExemploMelhorado {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5,6,7,8);

        listaDeNumeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}