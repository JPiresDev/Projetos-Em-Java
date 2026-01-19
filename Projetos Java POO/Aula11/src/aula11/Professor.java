/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author João Pires
 */
public class Professor extends Pessoa {
    private String especialidade;
    private int salario;
    
    public void receberAluno(){
        System.out.println("Aluno chegou a sala de aula do " + this.nome +
                " para sua aula de " + this.especialidade);
    }
    public void receberAumento(int aum){
        this.salario += aum;
        System.out.println(this.salario + aum + " esse é o seu novo salario! " );
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
