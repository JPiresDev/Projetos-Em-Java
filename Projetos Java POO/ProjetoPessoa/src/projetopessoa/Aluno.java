/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoa;

/**
 *
 * @author João Pires
 */
public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    public void cancelMatricula(){
        this.curso = "Mátricula Cancelada!";
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurs() {
        return curso;
    }

    public void setCurs(String curs) {
        this.curso = curs;
    }
    
}
