package examen1;

import java.util.ArrayList;
import java.util.Collections;

public class Examen1 {
    
    static ArrayList<String> extraerDiasDeSemana(ArrayList<String> palabras){
    
        ArrayList<String> Semana= new ArrayList<>();
        if (palabras.contains("lunes"))
            Semana.add("lunes");
        if (palabras.contains("martes"))
            Semana.add("martes");
        if (palabras.contains("miercoles"))
            Semana.add("miercoles");
        if (palabras.contains("jueves"))
            Semana.add("jueves");
        if (palabras.contains("viernes"))
            Semana.add("viernes");
        if (palabras.contains("sabado"))
            Semana.add("sabado");
        if (palabras.contains("domingo"))
            Semana.add("domingo");
        
        
        return Semana;
    }
    
    static boolean sonMayoresDeEdad(ArrayList<Integer> edades){
   
        boolean x=true;
        for(int contador=0; contador<edades.size(); contador++)
        {
            if (edades.get(contador)<18)
            x=false;
        
        }
        
        return x;
    }

    
    public static void main(String[] args) {
        Suma s1 = new Suma(5,2);
        Suma s2 = new Suma(20,10);
        Resta r1 = new Resta(5,2);
        Resta r2 = new Resta(20,10);
        
        System.out.print("herencia: \t\t");
        if(s1 instanceof Operacion
                && s2 instanceof Operacion
                && r1 instanceof Operacion
                && r2 instanceof Operacion
                )
        {
            System.out.println("correcto");
        }else
        {
            System.out.println("incorrecto");
        }
        
        System.out.print("calcular: \t\t");
        if(s1.calcular() == 7
                && s2.calcular() == 30
                && r1.calcular() == 3
                && r2.calcular() == 10
                )
        {
            System.out.println("correcto");
        }else
        {
            System.out.println("incorrecto");
        }
        
        ArrayList<String> list_palabras_1 = new ArrayList<>();
        list_palabras_1.add("junio");
        list_palabras_1.add("lunes");
        list_palabras_1.add("luna");
        list_palabras_1.add("viernes");
        list_palabras_1.add("jueves");
        
        ArrayList<String> list_palabras_2 = new ArrayList<>();
        list_palabras_2.add("domingo");
        list_palabras_2.add("martes");
        list_palabras_2.add("silla");
        list_palabras_2.add("nube");
        
        ArrayList<String> extraer_respuesta1 = extraerDiasDeSemana(list_palabras_1);
        ArrayList<String> extraer_respuesta2 = extraerDiasDeSemana(list_palabras_2);
        
        System.out.print("extraerDiasDeSemana: \t");
        if(extraer_respuesta1 != null && extraer_respuesta2 != null
                && extraer_respuesta1.size() == 3
                && extraer_respuesta2.size() == 2
                && extraer_respuesta1.contains("lunes")
                && extraer_respuesta1.contains("viernes")
                && extraer_respuesta1.contains("jueves")
                && extraer_respuesta2.contains("domingo")
                && extraer_respuesta2.contains("martes")
                )
        {
            System.out.println("correcto");
        }else
        {
            System.out.println("incorrecto");
        }
        
        ArrayList<Integer> list_edades_1 = new ArrayList<>();
        list_edades_1.add(24);
        list_edades_1.add(65);
        list_edades_1.add(40);
        
        ArrayList<Integer> list_edades_2 = new ArrayList<>();
        list_edades_2.add(33);
        list_edades_2.add(15);
        list_edades_2.add(21);
        list_edades_2.add(24);
        
        ArrayList<Integer> list_edades_3 = new ArrayList<>();
        list_edades_3.add(14);
        list_edades_3.add(29);
        list_edades_3.add(30);
        
        ArrayList<Integer> list_edades_4 = new ArrayList<>();
        list_edades_4.add(45);
        list_edades_4.add(18);
        list_edades_4.add(19);
        list_edades_4.add(20);
        
        System.out.print("sonMayoresDeEdad: \t");
        if(sonMayoresDeEdad(list_edades_1)
                && !sonMayoresDeEdad(list_edades_2)
                && !sonMayoresDeEdad(list_edades_3)
                && sonMayoresDeEdad(list_edades_4)
                )
        {
            System.out.println("correcto");
        }else
        {
            System.out.println("incorrecto");
        }
    }
    
}
