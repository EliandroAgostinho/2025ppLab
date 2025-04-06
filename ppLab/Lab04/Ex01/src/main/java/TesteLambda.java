import java.util.Comparator;
import java.util.List;

public class TesteLambda {
    public static void run(List<Aluno> alunos) {
        alunos.stream()
                .filter(a -> a.getId() > 14000)  // Lambda para filtro
                .sorted((a1, a2) -> a2.getNome().compareTo(a1.getNome()))  // Lambda para ordenação descendente
                .forEach(System.out::println);
    }
}
