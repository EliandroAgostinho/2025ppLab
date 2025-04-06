import java.util.function.Predicate;

@FunctionalInterface
public interface FiltroAluno extends Predicate<Aluno> {
    /**
     * Método abstrato que define o critério de filtro
     * @param a Aluno a ser avaliado
     * @return true se o aluno atender ao critério
     */
    boolean aceita(Aluno a);

    /**
     * Implementação default que conecta ao Predicate
     * @param a Aluno a ser avaliado
     * @return resultado do método aceita
     */
    @Override
    default boolean test(Aluno a) {
        return aceita(a);
    }
}