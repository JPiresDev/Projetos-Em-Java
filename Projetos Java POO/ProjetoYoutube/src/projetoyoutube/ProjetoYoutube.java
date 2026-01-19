/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author João Pires
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video ("Aula 1 Poo");
        v[1] = new Video ("Aula 2 de poo");
        v[2] = new Video ("Aula 3 de poo");
        
        Gafanhoto g[] = new Gafanhoto [2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 18, "F", "Creuzzita");
        
        Visualizacao vis[] = new Visualizacao [5];
        vis [0] = new Visualizacao (g[0], v [2]); // Jubileu assiste poo 3
        vis[0].avaliar();
        System.out.println(vis[0].toString());
       
        vis [1] = new Visualizacao (g[0], v [1]); //Jubileu assiste poo 1
        vis[0].avaliar(35.0f);
        System.out.println(vis[1].toString());
        /*System.out.println("VIDEOS\n------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
