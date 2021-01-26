/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Q2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        //Television sınıfından tv1 nesnesinin yaratılması 
        Television tv1 = new Television(6, 8, 10, 50, false);
        tv1.getTVInfo();
        
        //Yaratılan nesne Güc Modu: Off olarak yaratıldığı için Güc modunu
        //değiştiren kod blogu
        if (tv1.power == false){
            System.out.println("TV is initializing...");
            tv1.PowerSwitcher(tv1.power);
        }
        
        //Nesnenin ses düzeyini artırıp azaltmak için kullanılan kod blokları
        //Kosula baglı sonucların görünmesi icin farklı degerlerde tekrar tekrar
        //kullanıldı
        System.out.println("-----");
        tv1.VolumeDown(-5);
        System.out.println("-----");
        tv1.VolumeDown(25);
        System.out.println("-----");
        tv1.VolumeDown(30);
        
        System.out.println("-----");
        tv1.VolumeUp(120);
        System.out.println("-----");
        tv1.VolumeUp(30);
        System.out.println("-----");
        tv1.VolumeUp(25);
        
        //tv1.screenSize; Hatalı satır

        // Aşağıdaki kodlarda kendimce interaktif yapmaya çalıştım ancak
        //Verimli olmadığı için iptal ettim..
        
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to get Tv on? (Y/N): ");
        String ans = sc.nextLine();

        
        if (ans.equals("Y") || ans.equals("y")){
            System.out.println("TV is initializing...");
            tv1.PowerSwitcher(tv1.power);
        } else if (ans.equals("N") || ans.equals("n")) {
            System.out.println("Tv is already off");
            
            
        } else {
            System.out.println("Error");
        }
        
        System.out.println("********************");
        tv1.getTVInfo();
        System.out.println("********************");
        
        
        System.out.println("Volume Up or Volume Down: ");
        ans = sc.nextLine();
        System.out.println("Please enter new volume: ");
        int ans2 = sc.nextInt();
        sc.close();
        
        if (ans.equals("Up")|| ans.equals("up")){
            tv1.VolumeUp(ans2);
        } else if (ans.equals("Down")|| ans.equals("down")){
            tv1.VolumeDown(ans2);
        } else {
            System.out.println("An Error Occured...");
        }
        
       */
       

    }
}
