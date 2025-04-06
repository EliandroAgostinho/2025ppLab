import java.util.Collections;
import java.util.List;


public class AlunoSorterBubble {
    // Ordenação por nome (lexicográfica)
    public static void bubbleSortPorNomeLex(List<Aluno> alunos) {
        if (alunos == null || alunos.isEmpty()) return;

        for (int i = 0; i < alunos.size() - 1; i++) {
            for (int j = 0; j < alunos.size() - 1 - i; j++) {
                if (alunos.get(j).getNome().compareTo(alunos.get(j + 1).getNome()) > 0) {
                    Collections.swap(alunos, j, j + 1);
                }
            }
        }
    }

    // Ordenação pelo tamanho do nome (crescente)
    public static void bubbleSortPorNomeLen(List<Aluno> alunos) {
        if (alunos == null || alunos.isEmpty()) return;

        for (int i = 0; i < alunos.size() - 1; i++) {
            for (int j = 0; j < alunos.size() - 1 - i; j++) {
                if (alunos.get(j).getNome().length() > alunos.get(j + 1).getNome().length()) {
                    Collections.swap(alunos, j, j + 1);
                }
            }
        }
    }

    // Ordenação por nota (crescente)
    public static void bubbleSortPorNota(List<Aluno> alunos) {
        if (alunos == null || alunos.isEmpty()) return;

        for (int i = 0; i < alunos.size() - 1; i++) {
            for (int j = 0; j < alunos.size() - 1 - i; j++) {
                if (alunos.get(j).getNota() > alunos.get(j + 1).getNota()) {
                    Collections.swap(alunos, j, j + 1);
                }
            }
        }
    }
}
