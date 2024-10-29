import java.util.Arrays;
import java.util.List;

public class Desafio_16 {
    public static void main(String[] args) {
        //Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().filter(num -> num % 2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(num -> num % 2 != 0).toList();

        System.out.println("Números Pares: "+numerosPares);
        System.out.println("Números Impares: "+numerosImpares);
    }
}