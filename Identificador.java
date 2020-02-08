/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generador;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Migue
 */
public class Identificador {
    //Declaración de int opcion para usar en el switch
    static int opcion;
    //Declaración de nuestro scanner llamado teclado para entrada
    static Scanner teclado = new Scanner(System.in);   
    // Declaración de nuestro arreglo de tipo string
    static String[ ] caracter = new String [37];
    // Declaración de una herramienta Random
    static Random rand = new Random();
    // Declaración de variables int auxiliares
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
  

    /**
     * @param args the command line arguments hola
     */
    
    private static void longitud1() {
    // Método para imprimir identificadores de longitud 1
    System.out.println("\n******* Identificador de longitud 1: ******* \n");
    // Asignación de una posición random a nuestra variable auxiliar a
    a=rand.nextInt(27);
    //impresión de nuestro arreglo caracter en la posición aleatoria a
    System.out.println(caracter[a]);
       
    }
    
    private static void longitud2() {
     // Método para imprimir identificadores de longitud 2    
    System.out.println("\n******* Identificador de longitud 2: ******* \n");
    // Asignación de una posición random a nuestras variables auxiliares a y b
    a=rand.nextInt(27);
    b=rand.nextInt(37);
    //impresión de nuestro arreglo caracter en la posición aleatoria a y b
    System.out.println(caracter[a]+caracter[b]);
    }
    
    private static void longitud3() {
     // Método para imprimir identificadores de longitud 3        
    System.out.println("\n******* Identificador de longitud 3: ******* \n");
    // Asignación de una posición random a nuestras variables auxiliares a, b y c
    a=rand.nextInt(27);
    b=rand.nextInt(37);
    c=rand.nextInt(37);
    //impresión de nuestro arreglo caracter en la posición aleatoria a, b y c
    System.out.println(caracter[a]+caracter[b]+caracter[c]);
    }
    
    private static void longitud4() {
    // Método para imprimir identificadores de longitud 4        
    System.out.println("\n******* Identificador de longitud 4: ******* \n");
    // Asignación de una posición random a nuestras variables auxiliares a, b, c y d
    a=rand.nextInt(27);
    b=rand.nextInt(37);
    c=rand.nextInt(37);
    d=rand.nextInt(37);
    //impresión de nuestro arreglo caracter en la posición aleatoria a, b, c y d
    System.out.println(caracter[a]+caracter[b]+caracter[c]+caracter[d]);
    }
    
    private static void longitud5() {
    // Método para imprimir identificadores de longitud 4     
    System.out.println("\n******* Identificador de longitud 5: ******* \n");
     // Asignación de una posición random a nuestras variables auxiliares a, b, c, d, y e
    a=rand.nextInt(27);
    b=rand.nextInt(37);
    c=rand.nextInt(37);
    d=rand.nextInt(37);
    e=rand.nextInt(37);
     //impresión de nuestro arreglo caracter en la posición aleatoria a, b, c, d, y e
    System.out.println(caracter[a]+caracter[b]+caracter[c]+caracter[d]+caracter[e]);
    }
    
    private static void datos() {
   //impresión de los datos de nuestro equipo así como datos de la materia y maestra
    System.out.println("Nombre del equipo: Scraft");
    System.out.println("");
    System.out.println("Integrantes del equipo: ");
    System.out.println("");
    System.out.println("Vania Del Angel Juárez 17500654");
    System.out.println("Miguel Angel Segura Bravo 17500681");
    System.out.println("Francisco Javier Gónzalez Hernández 17500660");
    System.out.println("Jonathan Pacheco Cruz 17500672");
    System.out.println("");
    System.out.println("Materia: Lenguaje y autómatas");
    System.out.println("");
    System.out.println("Maestra: Lic. Maria Alejandra Rosas Toro");
    System.out.println("");
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
   
    // Asignación de valores a cada posición de nuestro arreglo
    caracter[0] = "a";
    caracter[1] = "b";
    caracter[2] = "c";
    caracter[3] = "d";
    caracter[4] = "e";
    caracter[5] = "f";
    caracter[6] = "g";
    caracter[7] = "h";
    caracter[8] = "i";
    caracter[9] = "j";
    caracter[10] = "k";
    caracter[11] = "l";
    caracter[12] = "m";
    caracter[13] = "n";
    caracter[14] = "ñ";
    caracter[15] = "o";
    caracter[16] = "p";
    caracter[17] = "q";
    caracter[18] = "r";
    caracter[19] = "s";
    caracter[20] = "t";
    caracter[21] = "u";
    caracter[22] = "v";
    caracter[23] = "w";
    caracter[24] = "x";
    caracter[25] = "y";
    caracter[26] = "z";
    caracter[27] = "0";
    caracter[28] = "1";
    caracter[29] = "2";
    caracter[30] = "3";
    caracter[31] = "4";
    caracter[32] = "5";
    caracter[33] = "6";
    caracter[34] = "7";
    caracter[35] = "8";
    caracter[36] = "9";
    
     // do-while para crear un menú según el caso
    do{
    System.out.println("---- Generación de un Identificador ----");
    System.out.println("");
    System.out.println(" A continuación eliga la opción que desea: ");
    System.out.println(">>>> 1.- Identificador de longitud 1 <<<<");
    System.out.println(">>>> 2.- Identificador de longitud 2 <<<<");
    System.out.println(">>>> 3.- Identificador de longitud 3 <<<<");
    System.out.println(">>>> 4.- Identificador de longitud 4 <<<<");
    System.out.println(">>>> 5.- Identificador de longitud 5 <<<<");
    System.out.println(">>>> 6.- Datos del equipo <<<<");
    System.out.println(">>>> 7.- Salir <<<<");
    //Sentencia para asignar a la variable opción el próximo número leído
    opcion=teclado.nextInt();
    
    switch(opcion){
        // diferentes casos según la opción que ingresamos anteriormente
        case 1:
            longitud1();
            break;            
        case 2:
            longitud2();
            break;
        case 3:    
            longitud3();
            break;
        case 4:
            longitud4();
            break;
        case 5:
            longitud5();
            break;
        case 6:
            datos();
            break;
        case 7:
            System.out.println("Hasta luego!!");
            break;
      
    }//while que se usa para cerrar cuando se teclee el número 7
    }while(opcion!=7);
        
    
    }
 
}
