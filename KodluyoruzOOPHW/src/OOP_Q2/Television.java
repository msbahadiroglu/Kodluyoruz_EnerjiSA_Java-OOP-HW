/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Q2;

/**
 *
 * @author Seyfullah
 */

//Ödev açıklamasında belirtilen Television sınıfı
public class Television {
    double width;
    double heigth;
    double screenSize;
    int maxVolume;
    int volume;
    boolean power;
    
    //Television sınıfından Television nesne tanımı
    public Television(double width,double heigth, 
                      double screenSize,int volume, boolean power){
        
        this.width=width;
        this.heigth=heigth;
        this.screenSize=screenSize;
        this.maxVolume = 100;
        this.volume= volume;
        this.power = power;
       
    }
    
    //Television nesnesinin özelliklerini ekrana bastıran metod
    void getTVInfo (){
        System.out.println("Width: " + width);
        System.out.println("Heigth: " + heigth);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Volume " + volume);
        
        if (power){
            System.out.println("Power: On");
        } else {
            System.out.println("Power: Off");
        }
        
        
    }
    
    //Television nesnesinin güç durumunu kontrol edip değiştirmeye yarayan metod
    public boolean PowerSwitcher (boolean newpower){
        this.power = power;
        
        if (power == false) {
            power = true;
            System.out.println("TV is on");
        } else {
            power = false;
            System.out.println("TV is off");
        }
        return newpower;
    }
    
    //Nesnenin Ses düzeyi özelliğini ekrana bastıran metod
    public int getVolume() {
        return this.volume;
    }
    
    //Nesnenin ses düzeyini azaltmaya ve artırmaya yarayan metodlar 
    public void VolumeDown(int newVolume){

        if (newVolume> this.volume) {
            System.out.println("New volume might be smaller then current value...");
        }
        else if (newVolume < 0){
            System.out.println("Volume can't be negative values...");
        } else {
            this.volume = newVolume;
            System.out.println("Volume is downgrading...");
            System.out.println("New Volume: " + newVolume);
        }  
    }
    
    public void VolumeUp(int newVolume){
        this.maxVolume=maxVolume;
        
        if (newVolume > maxVolume) {
            System.out.println("Max volume is " + maxVolume);
            
        }
        else if (newVolume < this.volume){
            System.out.println("New volume might be bigger then current value");
        } else {
            this.volume = newVolume; 
            System.out.println("Volume is upgrading...");
            System.out.println("New Volume: " + newVolume);
        }  
    }
    
}
