
package Entity;

public class Circulo extends Figuras{

    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double calcularArea() {
       return PI * Math.pow(radio, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return PI * (radio*2);
        // diametro : (radio*2)
    }


    
}

//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.