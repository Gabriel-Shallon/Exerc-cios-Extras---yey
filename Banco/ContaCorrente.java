package Banco;

public class ContaCorrente extends ContaBancaria {
   


    ContaCorrente(int agencia, String conta , float saldo){
        super(agencia, conta, saldo);
    }
   


 public void depositar(float quantia){


        saldo +=quantia;
       
    }
   
    public boolean sacar(float quantia){
        boolean boo = false;
        if(quantia>saldo){
            System.out.println("Saldo Insuficiente!");
            boo = false;
        }else {
                System.out.println("Saque realizado com sucesso!");
                saldo = saldo - quantia;
               System.out.println(true);
                boo = true;
            }    
return boo;
     
    }


   
    }











