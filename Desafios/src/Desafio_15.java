import java.util.List;
import java.util.Arrays;

public class Desafio_15 {
    public static void main(String[] args) {
        //Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream().filter(num -> num < 0).toList();

        System.out.println((numerosNegativos.isEmpty()) ? "Não há algum número negativo na lista" : "Números negativos: "+numerosNegativos);
    }
}
