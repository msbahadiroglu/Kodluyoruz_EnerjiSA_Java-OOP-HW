/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Q3;

/**
 *
 * @author Seyfullah
 */
public class App {
    public static void main(String[] args) {
        
        
        //Pair sınıfına ait Integer ve String değerleri tutabilen Object1 nesnesi
        //ve Object1 için her iki özellik değerinin atanması
        Pair<Integer,String> Object1 = new Pair<Integer, String>();
        Object1.setfirst(15);
        Object1.setsecond("Seyfullah");
        
        //Pair sınıfına ait double ve Integer değerleri tutabilen Object2 nesnesi
        //ve Object2 için her iki özellik değerinin atanması
        Pair<Double,Integer> Object2 = new Pair<Double, Integer>();
        Object2.setfirst(256.0);
        Object2.setsecond(256);
       
        
        // Her iki nesneye ait getter metodların kullanımı
        System.out.println("1. Nesne 1. Özellik: " + Object1.getFirst() +"\t\t"+ Object1.getFirst().getClass() );
        System.out.println("1. Nesne 2. Özellik: " + Object1.getSecond()+"\t"+ Object1.getSecond().getClass());
        
        System.out.println("2. Nesne 1. Özellik: " + Object2.getFirst() +"\t"+ Object2.getFirst().getClass());
        System.out.println("2. Nesne 2. Özellik: " + Object2.getSecond()+"\t"+ Object2.getSecond().getClass());
        
       
        
    }
    
  
}
