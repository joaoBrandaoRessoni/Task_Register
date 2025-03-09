/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaComPrazo;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author android
 */
public class TarefaController<T> {
    GerenciaTarefas gerenciador = new GerenciaTarefas();
    
    public Tarefa index(Tarefa tarefa){
        return GerenciaTarefas.procurar(tarefa);
    }
    
    public Tarefa index(int index){
        return GerenciaTarefas.procurar(index);
    }
    
    public List<Tarefa> show(){
        return GerenciaTarefas.listar();
    }
    /**
     * Tentar cadastrar uma tarefa simples
     * @param desc : Descrição da Tarefa
     * @param prior : Prioridade da Tarefa
     * @param data : Data de criação da tarefa
     * @return boolean se foi adicionado ou não
     */
    public boolean addTarefa(String desc, int prior, LocalDate data){
       return GerenciaTarefas.cadastrar(new TarefaSimples(desc, prior, data));
    }
    
    /**
     * Tentar cadastrar uma tarefa com prezo
     * @param desc : Descrição da Tarefa
     * @param prior : Prioridade da Tarefa
     * @param data : Data de criação da tarefa
     * @param prazo : Data do prazo limite que a tarefa deve ser concluida
     * @return boolean se foi adicionado ou não
     */
    public boolean addTarefa(String desc, int prior, LocalDate data, LocalDate prazo){
       return GerenciaTarefas.cadastrar(new TarefaComPrazo(desc, prior, data, prazo));
    }
    
    public boolean remove(Tarefa tarefa){
        return GerenciaTarefas.deletar(tarefa);
    }
}
