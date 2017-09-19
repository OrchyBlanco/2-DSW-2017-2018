package AUT01_01;

import java.util.ArrayList;

public class AUT01_01_TorresBlancoJesus{

    public static void main(String[] args){
     
     Sumatorio();
    }
    
    public static void Sumatorio(){
        ArrayList <Integer> lst=new ArrayList<>();
        int r=0;
        lst.add(1);
        lst.add(2);
        lst.add(3);
        
        for(Integer object : lst){
            r=r+object;
        }
        System.out.println("Hola el doble del resultado es: "+r*2);
    }
}