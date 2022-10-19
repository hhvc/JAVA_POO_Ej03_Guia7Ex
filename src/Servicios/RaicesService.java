/*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
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
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b */
package Servicios;

import Entidad.Raices;

public class RaicesService {
    
    public boolean tieneRaices(Raices z){
       
        if (z.getDiscriminante()>0) {
            return true;
        } else return false;
    } 
    
    public boolean tieneRaiz(Raices z){
        if(z.getDiscriminante()==0){
            return true;
        }else return false;
    }
 
    public void obtenerRaices(Raices z){
        if (this.tieneRaices(z)) {
            System.out.println("Esta ecuación tiene 2 soluciones posibles:");
            System.out.println("x1 = "+((-z.getB() + z.getDiscriminante()))/(2*z.getA()));
            System.out.println("x2 = "+((-z.getB() - z.getDiscriminante()))/(2*z.getA()));
        }
    }
    
    public void obtenerRaiz(Raices z){
        if (this.tieneRaiz(z)) {
            System.out.println("Esta ecuación tiene 1 sola solución posible");
            System.out.println("x1 = "+(-z.getB())/(2*z.getA()));
        }
    }
    
    public void calcular(Raices z){
        
        if (this.tieneRaices(z)) {
            this.obtenerRaices(z);
        }else if (this.tieneRaiz(z)) {
            this.obtenerRaiz(z);
        } else System.out.println("Esta ecuación no tiene solución");
    }
    
}
