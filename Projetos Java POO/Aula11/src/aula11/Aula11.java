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
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1 = new Visitante ();
        v1.setNome("LoucoAbreu");
        v1.setIdade(45);
        v1.setSexo("M");
        
        Aluno a1 = new Aluno();
        a1.setNome("Pires");
        a1.setMatricula(1111);
        a1.setIdade(21);
        a1.setCurso("Programming");
        a1.setSexo("M");
        a1.PagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.PagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setEspecialidade("Português");
        p1.setIdade(56);
        p1.setNome("Paschoal");
        p1.setSexo("M");
        p1.setSalario(2450);
        p1.receberAluno();
        int aum = 500;
        p1.receberAumento(aum);
        
        Tecnico t1 = new Tecnico ();
        t1.setNome("Gabriel");
        t1.setCurso("Engenheria");
        t1.setSexo("M");
        t1.setMatricula(1113);
        t1.setRegistroProfi("Engenharia");
        t1.praticar();
       
    }
    
}
