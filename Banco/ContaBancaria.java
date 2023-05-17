package Banco;

public class ContaBancaria {


    protected int agencia;
    protected String conta;
    protected float saldo;
   




   
    public float getSaldo() {
        return saldo;
    }
   
   




ContaBancaria(int agencia, String conta , float saldo){
    this.agencia=agencia;
    this.conta=conta;
    this.saldo=saldo;
   }




    public void depositar(float quantia){


        saldo +=quantia;
       
    }
   




   
   
}









