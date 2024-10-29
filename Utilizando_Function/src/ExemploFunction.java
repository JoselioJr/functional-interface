import java.util.Arrays;
import java.util.List;

public class ExemploFunction {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosDobrados = listaDeNumeros.stream().map(n -> n * 2).toList();

        numerosDobrados.forEach(System.out::println);
    }
}