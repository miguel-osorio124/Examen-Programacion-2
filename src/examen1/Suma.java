/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Alumno
 */
public class Suma extends Operacion{

    public Suma(double valor1, double valor2) {
        super(valor1, valor2);
    }
    public double calcular(){
        double calcular;
        calcular=valor1+valor2;
        return calcular;


    
}
}
