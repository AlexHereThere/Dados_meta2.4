/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.Random;

/**
 * modela un dado
 * @author ACR
 */
public class Dado {
    private final int numeroDeLados;
    private int caraMostrada;
    private final Random rmd;

    public Dado(int numeroDeLados) 
    {
        this.numeroDeLados = numeroDeLados;
        this.caraMostrada = 1;
        this.rmd = new Random();
    }
    
    /*
      Lanzar dado y agarrar el nuevo resultado como la caraMostrada
    */
    public void lanzarDado()
    {
        this.caraMostrada=rmd.nextInt(numeroDeLados)+1;   
    }
    
    /**
     *mostrar Dados
     * @return
     */
    @Override
    public String toString()
    {
        return "NumeroDeLados: "+numeroDeLados+" CaraMostrada: "+caraMostrada; 
    }
            
}
