/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package java_poo_ej03_guia7extras;

import Entidad.Raices;
import Servicios.RaicesService;
import java.util.Scanner;

public class JAVA_POO_Ej03_Guia7Extras {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        RaicesService rs = new RaicesService();
        System.out.println("Ingresaremos una ecuación de segundo grado (ax2+bx+c)=?");
        System.out.println("ingrese el valor para 'a'");
        double a = leer.nextDouble();
        System.out.println("ingrese el valor para 'b'");
        double b = leer.nextDouble();
        System.out.println("ingrese el valor para 'c'");
        double c = leer.nextDouble();
        Raices eq1 = new Raices(a,b,c);
        System.out.println(eq1.toString());
        System.out.println("El discriminante de la ecuación es: "+eq1.getDiscriminante());
        rs.calcular(eq1);
    }
    
}
