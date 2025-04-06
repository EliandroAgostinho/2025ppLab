import java.util.List;
public class AumentaNota {
    public static void run(List<Aluno> alunos) {
        alunos.stream()
                .peek(a -> a.setNota(a.getNota() + 1))  // Aumenta a nota em 1
                .forEach(System.out::println);
    }
}
