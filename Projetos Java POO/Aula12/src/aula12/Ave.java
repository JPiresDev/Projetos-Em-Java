/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author João Pires
 */
public class Ave extends Animal{
        private String corPena;
        
        
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimetar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de aves");
    }
     public void fazerNinho(){
         System.out.println("Construindo Ninho");
     }   

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
     
}
