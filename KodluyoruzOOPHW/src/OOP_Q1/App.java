
package OOP_Q1;

import java.util.Scanner;

/**
 *
 * @author Seyfullah
 */
public class App {
    public static void main(String[] args) {
        AdvancedCalculator GelismisMakine = new AdvancedCalculator();
        
        System.out.println("Multiplication: " + GelismisMakine.multiplication(5, 8));
        System.out.println("Division: " + GelismisMakine.division(100, 8));
        System.out.println("Square : " + GelismisMakine.squareMethod(5));
        System.out.println("Cube : " + GelismisMakine.cubeMethod(3));
  
    }
}
