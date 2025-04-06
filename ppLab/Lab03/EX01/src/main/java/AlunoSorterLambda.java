import java.util.Comparator;
import java.util.List;

public class AlunoSorterLambda {
    // Método genérico para ordenação com Comparator
    public static void sort(List<Aluno> alunos, Comparator<Aluno> comparator) {
        if (alunos != null) {
            alunos.sort(comparator);
        }
    }

    // Ordenação por nome (lexicográfica)
    public static void sortByNameLex(List<Aluno> alunos) {
        Comparator<Aluno> byNameLex = Comparator.comparing(Aluno::getNome);
        sort(alunos, byNameLex);
    }

    // Ordenação pelo tamanho do nome (crescente)
    public static void sortByNameLength(List<Aluno> alunos) {
        Comparator<Aluno> byNameLength = Comparator.comparing(aluno -> aluno.getNome().length());
        sort(alunos, byNameLength);
    }

    // Ordenação por nota (crescente)
    public static void sortByNota(List<Aluno> alunos) {
        Comparator<Aluno> byNota = Comparator.comparingInt(Aluno::getNota);
        sort(alunos, byNota);
    }
}
