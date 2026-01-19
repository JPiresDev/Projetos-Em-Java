/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojikombat;

/**
 *
 * @author João Pires
 */
public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias,derrotas, empates;

   public Lutador(
        String nome, String nacionalidade, int idade,
        float altura, float peso,
        int vitorias, int derrotas, int empates) {

    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    this.setPeso(peso);
    
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
    }
    //Metodos publicos
    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentarmos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.altura + " de altura");
        System.out.println("pesando " + this.getPeso() + "KG");
        System.out.println(this.getVitorias()+ " Vitórias ");
        System.out.println(this.getDerrotas() + " Derrotas ");
        System.out.println(this.getEmpates() + " Empates ");
        System.out.println("--------------------------------------");
    }
    public void status(){
        System.out.println("--------------------------------------");
        System.out.println(this.getNome() + "é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes ");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes ");
        System.out.println("Empatou " + this.getEmpates() + " vezes ");
        System.out.println("--------------------------------------");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }     
    public void empartarLuta(){
        this.setEmpates(this.getEmpates()+ 1);
    }
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, 
            float altura, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       if(this.peso < 52.2){
           this.categoria = " Invalido";
       } else if (this.peso<= 70.4){
           this.categoria = " Leve";
       }else if (this.peso<=83.9){
           categoria=" Médio";
       }else if (this.peso<=120.2){
           categoria=" Pesado";
       }else{
           this.categoria=" Inválido";
       }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
