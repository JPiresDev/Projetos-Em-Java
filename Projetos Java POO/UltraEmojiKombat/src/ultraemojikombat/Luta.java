/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojikombat;

import java.util.Random;

/**
 *
 * @author João Pires
 */
public class Luta {
   private Lutador desafiado;
   private Lutador desafiante;
   private int rounds;
   private boolean aprovada;
   //==========================//
   public void marcarLuta(Lutador l1, Lutador l2){
    if (l1.getCategoria().equals(l2.getCategoria())
        && l1 != l2) {
    this.aprovada = true;
    this.desafiado= l1;
    this.desafiante = l2;
        } else {
   this.aprovada = false;
   this.desafiado = null;
   this.desafiante = null;
        }
   }
   public void Lutar(){
    if (this.aprovada){
        System.out.println("--------------------------------------");
        System.out.println("### DESAFIADO ###");
        this.desafiado.apresentar();
        
        System.out.println("--------------------------------------");
        System.out.println("### DESAFIANTE ###");
        this.desafiante.apresentar();
        
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        
        switch (vencedor){
            case 0:
                System.out.println("--------------------------------------");
                System.out.println("A luta Empatou!");
                this.desafiado.empartarLuta();
                this.desafiante.empartarLuta();
                System.out.println("--------------------------------------");
                break;
            case 1:
                System.out.println("--------------------------------------");
                System.out.println("Vitoria do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println("--------------------------------------");
                break;
                
            case 2:
                System.out.println("--------------------------------------");
                System.out.println("Vitoria do " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                System.out.println("--------------------------------------");
                break;
        }
    }else{
        System.out.println("A luta não pode acontecer!");
    }   
  }
   //=============================//

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
//============================================================//
  
   
}
