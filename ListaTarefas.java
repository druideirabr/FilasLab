import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ListaTarefas implements FilaDeTarefas {
	Queue<Tarefa> tarefas = new PriorityQueue<Tarefa>(1,new Comparador());

	@Override
	public void addTask(String descTarefa, int prio) {
		tarefas.add(new Tarefa(descTarefa, prio));
	}

	@Override
	public int countTasks(int prio) {
		int cont = 0;
		for (Tarefa tar : tarefas)
			if (tar.getPrioridade() == prio)
				cont++;
		return cont;
	}

	@Override
	public String getNextTask() {
		return tarefas.remove().getDescricao();
	}


	

}
