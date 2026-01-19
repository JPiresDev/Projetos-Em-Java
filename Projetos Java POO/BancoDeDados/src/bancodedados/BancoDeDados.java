/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

/**
 *
 * @author João Pires
 */
public class BancoDeDados {
public int NumConta;
protected String Tipo;
private String Dono;
private float saldo;
private boolean status;

    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Contas: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public BancoDeDados() {
    this.saldo = 0;
    this.status = false;
    }

    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int N) {
        this.NumConta = N;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String T) {
        this.Tipo = T;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String D) {
        this.Dono = D;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
    public void abrirConta(String t){
        this.Tipo = t;
        this.status = true;
        if (t.equals("CC")){
            this.saldo = 50;
        } else if (t.equals("CP")){
            this.saldo= 150;
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.saldo>0){
            System.out.println("Conta com dinheiro, não pode ser fechada!");
        } else if (this.saldo<0){
            System.out.println("Conta em débito, não pode ser fechada!");
        }else{
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.status){
            this.saldo += v;
        }else{
            System.out.println("Impossivel depositar!");
        }
    }
    public void sacar (float v){
        if (this.status = true){
          if(this.saldo >= v){
              this.saldo -= v;
              System.out.println("Saque de R$" + v + "Realizado na conta de " + this.Dono);
          } else{
              System.out.println("Saldo Insuficiente!");
            }
          } else{
                  System.out.println("Impossivel Conta Fechada!");
          }
        }
        public void pagarMensal(){
            int v = 0;
            if(this.Tipo.equals("CC")){
                v=12;
            }else if (this.Tipo.equals("CC"));
            v = 20;
    
      if (this.status){
    this.saldo -= v;
            System.out.println("Mensalidade de R$" + v + "debitada da conta de " + this.Dono);
} else{
            System.out.println("Impossivel pagar mensalidade em conta fechada!");
} 
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
