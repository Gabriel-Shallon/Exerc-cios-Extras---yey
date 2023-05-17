package Area_e_perimetro;

import javax.swing.JOptionPane;

public class Circulo {
    

    protected double raio; 
    protected double area;
    protected double perimetro;

    Circulo(double raio) {
        this.raio = raio;
        area();
        perimetro();
    }


    public void area(){
        area = 3.14 * (raio * raio);
        JOptionPane.showMessageDialog(null, "A area do circulo é: "+area);
    }

    public void perimetro(){
        perimetro = (3.14 * 2) *raio;
        JOptionPane.showMessageDialog(null, "o perimetro do circulo é: "+perimetro);
    }

}
