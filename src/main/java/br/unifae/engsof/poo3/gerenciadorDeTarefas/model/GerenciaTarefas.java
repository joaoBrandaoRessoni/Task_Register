package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author android
 */
public class GerenciaTarefas {
    private static List<Tarefa> tarefas = null;

    public GerenciaTarefas() {
        if(tarefas == null){
            tarefas = new ArrayList<>();
        }
    }
    
    public static boolean cadastrar(Tarefa tarefa){
        if(tarefas != null){
            if(!(tarefas.contains(tarefa))){
                return tarefas.add(tarefa);
            }
        }
        return false;
    }
    
    public static List<Tarefa> listar(){
        return tarefas;
    }
    
    public static Tarefa procurar(Tarefa tarefa){
        int index = tarefas.indexOf(tarefa);
        return tarefas.get(index);
    }
    
    public static Tarefa procurar(int index){
        return tarefas.get(index);
    }
    
    public static boolean deletar(Tarefa tarefa){
        if(tarefa!=null){
            return tarefas.remove(tarefa);
        }
        return false;
    }
}
