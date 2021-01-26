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
public class Pair <T1, T2>  {
    private T1 first;
    private T2 second;
    

    
    public void setfirst(T1 first){
        this.first = first;
    }
    
    public void setsecond(T2 second){
        this.second = second;
    }
    
    public T1 getFirst(){
        return first;
    }
    
    public T2 getSecond(){
        return second;
    }
   

}
