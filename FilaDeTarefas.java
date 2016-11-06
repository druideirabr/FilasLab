public interface FilaDeTarefas {
	public final int PRIO_URGENTE = 20;
	public final int PRIO_NORMAL = 0;
	public final int PRIO_BAIXA = -20;

	public void addTask(String descTarefa, int prio);

	public int countTasks(int prio);

	public String getNextTask();
}