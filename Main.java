import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Integer prioridade = null;
		ListaTarefas lista = new ListaTarefas();
		boolean adicionarMais = true;
		String descricao = null;
		while(adicionarMais){
		descricao = new JOptionPane().showInputDialog("Descreva a tarefa");
		String[] possibleValues = { "Alta", "Normal", "Baixa" };
		Object selectedValue = JOptionPane.showInputDialog(null, "Escolha a Prioridade", "Prioridade",
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
		if (selectedValue != null && selectedValue.equals(possibleValues[0]))
			prioridade = lista.PRIO_URGENTE;
		else if (selectedValue != null && selectedValue.equals(possibleValues[2]))
			prioridade = lista.PRIO_BAIXA;
		else if (selectedValue != null && selectedValue.equals(possibleValues[1]))
			prioridade = lista.PRIO_NORMAL;
		else adicionarMais = false;
		if (prioridade != null && descricao != null)
		lista.addTask(descricao, prioridade);
		}
		System.out.println("PRIO BAIXA "+lista.countTasks(lista.PRIO_BAIXA));
		while(!lista.tarefas.isEmpty()){
			System.out.println(lista.getNextTask());
		}
	}
	
}
