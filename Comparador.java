import java.util.Comparator;

public class Comparador implements Comparator<Tarefa> {
	@Override
	public int compare(Tarefa o1, Tarefa o2) {
		return Integer.compare(o1.getPrioridade(),o2.getPrioridade());
		}
}
