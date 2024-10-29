import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio_07 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> novaListaDeNumeros = new ArrayList<>(numeros);

        novaListaDeNumeros.remove(numeros.stream().max(Comparator.naturalOrder()).get());

        System.out.println("Segundo maior número: "+novaListaDeNumeros.stream().max(Comparator.naturalOrder()).get());
    }
}
