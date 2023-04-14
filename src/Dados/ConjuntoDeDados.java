/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.ArrayList;

/**
 *modela el conjunto en donde se guardan los dados
 * @author ACR
 */
public class ConjuntoDeDados {
private ArrayList<Dado> dados;

public ConjuntoDeDados(){
    dados=new ArrayList<>();
}

/*
crear un nuevo dado y almacenarlo en el conjunto
*/
public void almacenarDado(int numeroDeCaras)
{
    Dado dado_nuevo=new Dado(numeroDeCaras);
    dados.add(dado_nuevo);
}
/*
mostrar un dado especificado del conjunto
*/
public void mostrarDado(int numeroDeDado)
{
    System.out.println(dados.get(numeroDeDado));
}
/*
lanzar un dado especificado del conjunto
*/
public void lanzarUnDado(int numeroDeDado)
{
    dados.get(numeroDeDado).lanzarDado();
}        
 
public int getSize()
{
    return dados.size();       
}

}