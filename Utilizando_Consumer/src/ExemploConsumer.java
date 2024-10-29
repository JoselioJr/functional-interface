import java.util.Arrays;
import java.util.List;

public class ExemploConsumer {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5,6,7,8);

        listaDeNumeros.forEach(n -> {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        );
    }
}