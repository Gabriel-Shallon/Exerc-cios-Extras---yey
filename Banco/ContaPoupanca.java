package Banco;

public class ContaPoupanca extends ContaBancaria {


    private float limite;
        ContaPoupanca(int agencia, String conta , float saldo, float limite){
            super(agencia, conta, saldo);
            this.limite=limite;
        }
       
       
     public void depositar(float quantia){
   
            saldo +=quantia;
           
        }


        public void valorlimite(float quantia){
   
            limite = quantia;
           
        }
       
        public boolean sacar(float quantia){
            boolean boo = false;
            if(quantia>(saldo+limite)){
               System.out.println("Saldo Insuficiente!");
               boo = false;
   
            }else{
                quantia-=(saldo+limite);


               System.out.println("saque Realizado com Sucesso");
               saldo = saldo - quantia;
             
               boo = true;


            }
            return boo;
           
   
        }
   
   
   
   
        }
   
   
   
   





