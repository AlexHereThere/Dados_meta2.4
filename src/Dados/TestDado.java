/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dados;

import java.util.Scanner;

/**
 * para terminar el programa
 * @author 01806
 */
public class TestDado {

    /**
     * @param ubicacion
     * @param sc
     */
    public static void guardarDadoNuevo(ConjuntoDeDados ubicacion,Scanner sc)
    {
    int decision;
     System.out.println("Indique de cuantos lados sera el dado(se puede de 6 a 12):");
                do{
                decision=sc.nextInt();
                if(decision<6 || decision>12)System.out.println("Error: no se puede de ese tamano, introduce otra vez:");
                } while(decision<6 || decision>12);
                ubicacion.almacenarDado(decision);
    }
    
    public static void lanzarUnDado(ConjuntoDeDados ubicacion,Scanner sc)
    {
    int decision;
     System.out.println("Indica cual dado lanzar:");
     do{
        decision=sc.nextInt()-1;
        if(decision<0 || decision>=ubicacion.getSize())System.out.println("Error: no existe ese dado, introduce otra vez:");
        } while(decision<0 || decision>=ubicacion.getSize());
        ubicacion.lanzarUnDado(decision);
     }
        
    public static void mostrarUnDado(ConjuntoDeDados ubicacion,Scanner sc)
    {
     int decision;
     do{
        System.out.println("Indica cual dado monstrar:");
        decision=sc.nextInt()-1;
        if(decision<0 || decision>=ubicacion.getSize())System.out.println("Error: no existe ese dado, introduce otra vez:");
        } while(decision<0 || decision>=ubicacion.getSize());
        ubicacion.mostrarDado(decision);
    }
    
    
    public static void main(String[] args) {
       ConjuntoDeDados dados=new ConjuntoDeDados();
       Scanner sc = new Scanner(System.in);
       int decision;
       do{
        System.out.println("Indica Que hacer:");
        System.out.println("1-guardar dado nuevo");
        System.out.println("2-lanzar un dado");
        System.out.println("3-mostrar un dado");
        System.out.println("4-Salir");
        decision=sc.nextInt();
        switch(decision)
        {
            case 1:
              guardarDadoNuevo(dados,sc);
              break;
            case 2:
              if(dados.getSize()!=0)lanzarUnDado(dados,sc);
              else System.out.println("Error: esta vacio");
              break;
            case 3:
              if(dados.getSize()!=0)mostrarUnDado(dados,sc);
              else System.out.println("Error: esta vacio");
              break;
            case 4:
                System.out.println("Adios y Gracias :]");
              break;
            default:
                System.out.println("Error: no existe esa opcion");
        }
       }while(decision!=4);
    }
    
}

