package Area_e_perimetro;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class app {
    
    public static void main(String[] args){
        int forma = 0;
        
        UIManager.put("OptionPane.yesButtonText","Circulo");
        UIManager.put("OptionPane.noButtonText","Retangulo");
        
        forma = JOptionPane.showConfirmDialog(null, "Qual forma geométrica irá testar?", "Qual forma?", JOptionPane.YES_NO_OPTION);

        if ( forma == 0){
            double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o raio do circulo?"));
            Circulo areaCirculo = new Circulo(raio);
        }else{
            double altura = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Qual o altura do retangulo?"));
            double base = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Qual a base do retangulo?"));
            Retangulo area = new Retangulo(altura, base);
        }
    }
}
