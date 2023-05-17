package Banco;

import javax.swing.JOptionPane;

public class main {
    public class Main {
   
        public static void main (String[]args){
   
            ContaCorrente conta1 = new ContaCorrente(4596, "45258", 5000);
            ContaPoupanca conta2 = new ContaPoupanca(1234, "89665", 1000,500);
   
            JOptionPane.showMessageDialog(null, "------------------------------------------------------------\nConta Corrente\nsaldo Inicial: "+conta1.getSaldo());
            conta1.depositar(500);
            JOptionPane.showMessageDialog(null, "saldo Após depósito: "+conta1.getSaldo());
            conta1.sacar(2700);
            JOptionPane.showMessageDialog(null, "Saldo após saque "+conta1.getSaldo()+"\n------------------------------------------------------------\nConta Poupança\nsaldo Inicial: "+conta2.getSaldo());
            conta2.depositar(100);
            conta2.valorlimite(500);
            JOptionPane.showMessageDialog(null, "saldo Após depósito: "+conta2.getSaldo()+"\nSaldo: "+conta2.getSaldo());
            conta2.sacar(500);
            JOptionPane.showMessageDialog(null, "Saldo"+conta2.getSaldo());
            
           
        }
    }
   
   
   







}
