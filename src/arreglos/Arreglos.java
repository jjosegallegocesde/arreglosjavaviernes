/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
import paquete2.Heroe;

/**
 *
 * @author 503
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] numeros=new int[5];
        
    
        for(int i=0;i<numeros.length;i++){
            
            System.out.println("Digita un numero: ");
            numeros[i]=entrada.nextInt();
            
            
            
            
        }
        
        for(int i=0;i<numeros.length;i++){
            
            System.out.println(numeros[i]);
            
        }
        
        
        
        
        
        //como se utiliza un clase?
        //CREANDO OBJETO
        
        //QUE ES UN OBJETO?
        //UNA VARIABLE
      
        
        Heroe heroe=new Heroe();
        Enemigo enemigo=new Enemigo();
        
        //ACCEDIENDO A ATRIBUTOS
        enemigo.nombre="BORRÉ";
        heroe.nombre="LUCHO DIAZ";
        
        //ACCEDIENDO A UN ATRIBUTO PRIVADO
        heroe.setEdad(-5);
        
        
        
        //Imprimo valores der los atributos
        //System.out.println(heroe.nombre);
        //System.out.println(heroe.getEdad()); 
              
    }
    
}
