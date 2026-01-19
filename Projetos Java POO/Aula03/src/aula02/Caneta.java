/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author João Pires
 */
public class Caneta {
  public String Modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;
  public void status(){
      System.out.println("Modelo: " + this.Modelo);
      System.out.println("Uma Caneta " + this.cor);
      System.out.println("Ponta: " + this.ponta);
      System.out.println("Carga: " + this.carga); 
      System.out.println("está tampada? " + this.tampada);
  }
  public void rabiscar(){
      if(this.tampada == true){
          System.out.println("ERRO! Não posso rabiscar");   
      } else {
          System.out.println("Estou Rabiscando!");                
      }
  }
  public void tampar(){
      this.tampada = true;
  }
  public void destampar(){
      this.tampada = false;
}
}