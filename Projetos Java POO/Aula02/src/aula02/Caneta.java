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
  String Modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;
  void status(){
      System.out.println("Modelo: " + this.Modelo);
      System.out.println("Uma Caneta " + this.cor);
      System.out.println("Ponta: " + this.ponta);
      System.out.println("Carga: " + this.carga); 
      System.out.println("está tampada? " + this.tampada);
  }
  void rabiscar(){
      if(this.tampada == true){
          System.out.println("ERRO! Não posso rabiscar");   
      } else {
          System.out.println("Estou Rabiscando!");                
      }
  }
  void tampar(){
      this.tampada = true;
  }
  void destampar(){
      this.tampada = false;
}
}