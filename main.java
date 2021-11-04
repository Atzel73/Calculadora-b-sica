/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoratrabajo;

/**
 *
 * @author Propietario
 */
public class main {
    public static String Calculadora (String dato1, String dato2, String signo){
        
        Double resultado = 0.0;
        String respuesta;     
        
        
        if(signo.equals("+")){
            resultado = Double.parseDouble(dato1) + Double.parseDouble(dato2);
        }if(signo.equals("-")){
            resultado = Double.parseDouble(dato1) - Double.parseDouble(dato2);
        }if(signo.equals("*")){
            resultado = Double.parseDouble(dato1) * Double.parseDouble(dato2);
        }if(signo.equals("/")){
            resultado = Double.parseDouble(dato1) / Double.parseDouble(dato2);
        }
        respuesta = resultado.toString();

        return respuesta;
    }
    
    public static boolean ExistePunto(String cadena){
        boolean resultado;
        resultado = false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    
}
