import java.util.Arrays;
import java.util.List;

public class Desafio_06 {
    public static void main(String[] args) {
        //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Lista:");
        numeros.stream().forEach(System.out::println);
        
        System.out.println("\n'true' se há pelo menos 1 número > 10 ou 'false' se não há algum número > 10: "+numeros.stream().anyMatch(num -> num >10));
    }
}
