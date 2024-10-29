import java.util.Arrays;
import java.util.List;

public class ExemploPredicate {
    public static void main(String[] args) {
        List<String> lingaguensDeProgramacao = Arrays.asList("Java", "Python", "C", "Kotlin", "JavaScript", "Cobol");

        lingaguensDeProgramacao.stream().filter(palavra -> palavra.length() > 5).forEach(System.out::println);
    }
}
