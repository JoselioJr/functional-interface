import java.util.List;
import java.util.Arrays;

public class Desafio_09 {
    public static void main(String[] args) {
        //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> novaLista = numeros.stream().distinct().toList();

        System.out.println((numeros.size() == novaLista.size()) ? "Não há nenhum número repetido na lista" : "Há pelo menos 1 número repetido na lista");
    }
}
