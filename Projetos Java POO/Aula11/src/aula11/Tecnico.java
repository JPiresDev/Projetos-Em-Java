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
public class Tecnico extends Aluno {
    private String registroProfi;
    
    public void praticar(){
        System.out.println(this.nome + " Praticando... " + this.registroProfi);
    }

    public String getRegistroProfi() {
        return registroProfi;
    }

    public void setRegistroProfi(String registroProfi) {
        this.registroProfi = registroProfi;
    }
    
}
