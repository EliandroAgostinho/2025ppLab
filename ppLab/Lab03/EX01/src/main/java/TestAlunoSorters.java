import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestAlunoSorters {

    private List<Aluno> originalAlunos;

    @BeforeEach
    void setUp() {
        originalAlunos = new ArrayList<>(Arrays.asList(
                new Aluno(1, "Ana-Maria", "Silva", 18),
                new Aluno(2, "João", "Carlos", 15),
                new Aluno(3, "Maria", "Santos", 12)
        ));  // Faltava este parêntese
    }

    private List<Aluno> getFreshAlunos() {
        List<Aluno> freshList = new ArrayList<>();
        for (Aluno aluno : originalAlunos) {
            freshList.add(new Aluno(aluno.getId(), aluno.getNome(), aluno.getApelido(), aluno.getNota()));
        }
        return freshList;
    }

    @Test
    void testSortByNameLex() {
        List<Aluno> alunos = getFreshAlunos();
        AlunoSorterLambda.sortByNameLex(alunos);

        assertEquals("Ana-Maria", alunos.get(0).getNome());
        assertEquals("João", alunos.get(1).getNome());
        assertEquals("Maria", alunos.get(2).getNome());
    }

    @Test
    void testBubbleSortByNameLength() {
        List<Aluno> alunosForBubbleSort = getFreshAlunos();
        AlunoSorterBubble.bubbleSortPorNomeLen(alunosForBubbleSort);

        assertEquals("João", alunosForBubbleSort.get(0).getNome());
        assertEquals("Maria", alunosForBubbleSort.get(1).getNome());
        assertEquals("Ana-Maria", alunosForBubbleSort.get(2).getNome());
    }

    @Test
    void testSortByGrade() {
        List<Aluno> alunosForLambdaSort = getFreshAlunos();
        AlunoSorterLambda.sortByNota(alunosForLambdaSort);

        assertEquals(12, alunosForLambdaSort.get(0).getNota());
        assertEquals(15, alunosForLambdaSort.get(1).getNota());
        assertEquals(18, alunosForLambdaSort.get(2).getNota());
    }

    @Test
    void testBubbleSortByGrade() {
        List<Aluno> alunosForBubbleSort = getFreshAlunos();
        AlunoSorterBubble.bubbleSortPorNota(alunosForBubbleSort);

        assertEquals(12, alunosForBubbleSort.get(0).getNota());
        assertEquals(15, alunosForBubbleSort.get(1).getNota());
        assertEquals(18, alunosForBubbleSort.get(2).getNota());
    }
}