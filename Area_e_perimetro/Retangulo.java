package Area_e_perimetro;

import javax.swing.JOptionPane;

public class Retangulo{
    
    protected double base;
    protected double altura;
    protected double area;
    protected double perimetro;

    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        area();
        perimetro();
    }
   
    public void area(){
        area = base*altura;
        JOptionPane.showMessageDialog(null, "A area do retangulo é: "+area);
    }

    public void perimetro(){
        perimetro = 2*(base*altura);
        JOptionPane.showMessageDialog(null, "A perimetro do retangulo é: "+perimetro);
    }

}
