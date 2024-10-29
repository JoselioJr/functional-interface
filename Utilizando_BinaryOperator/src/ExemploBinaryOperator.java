import java.util.Arrays;
import java.util.List;

public class ExemploBinaryOperator {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer soma = listaNumeros.stream().reduce(0, Integer::sum); //indetify:0 - é a variável temporária para a soma Ex.: int somaTotal = 0; for...(Incrementação da soma dos numeros)

        System.out.println("A soma dos números é: "+soma);
    }
}
