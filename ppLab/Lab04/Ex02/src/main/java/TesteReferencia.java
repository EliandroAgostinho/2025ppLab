import java.util.Comparator;
import java.util.List;

public class TesteReferencia {
    public static void run(List<Aluno> alunos) {
        alunos.stream()
                .filter(TesteReferencia::filtroPorId)  // Method reference para filtro
                .sorted(Comparator.comparing(Aluno::getNome).reversed())  // Method reference para ordenação
                .forEach(System.out::println);
    }

    private static boolean filtroPorId(Aluno a) {
        return a.getId() > 14000;
    }
}
