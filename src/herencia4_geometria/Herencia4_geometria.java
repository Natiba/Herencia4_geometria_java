
package herencia4_geometria;

import Entity.Circulo;
import Entity.Rectangulo;

public class Herencia4_geometria {

    public static void main(String[] args) {
     
        Circulo circle = new Circulo (20d); // Asi le aclaro q es un DOUBLE
        Rectangulo rect = new Rectangulo(10d, 5d);
        
        System.out.println("El área del círculo es: " + circle.calcularArea());
        System.out.println("El perímetro del círculo es: " +circle.calcularPerimetro());
        
        System.out.println("El área del rectángulo es: " +rect.calcularArea());
        System.out.println("El perímetro del rectángulo es: " +rect.calcularPerimetro());
        
    }
    
}

//Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
//geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
//dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
//dos métodos para calcular el área, el perímetro y el valor de PI como constante.
//Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
//calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
//resultado final.
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.