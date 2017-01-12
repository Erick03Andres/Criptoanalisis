/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptoanalisis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author EQUIPO
 */
public class Contador 
{
    private Map<String, Double> ocurrencias;
    private double contadorV=0;
    private double contadorC=0;
    private int total=0;

    public Contador() 
    {
        ocurrencias=new HashMap<String, Double>();
    }
    
    public void contar(String linea)
    {
        total=linea.length();
        
        for(int i=0; i<linea.length(); i++)
        {
            if(null==ocurrencias.get(""+linea.charAt(i))) ocurrencias.put(""+linea.charAt(i), 1D);
            else 
            {
                Double valor=ocurrencias.get(""+linea.charAt(i));
                valor++;
                ocurrencias.put(""+linea.charAt(i), valor);
            }   
        }
    }

    public Map<String, Double> getOcurrencias() {
        return ocurrencias;
    }
    
    public void contarVocales(String linea)
    {
        for(int i=0; i<linea.length(); i++)
        {
            if((linea.charAt(i)=='a') || (linea.charAt(i)=='e') || (linea.charAt(i)=='i') || (linea.charAt(i)=='o') || (linea.charAt(i)=='u')) contadorV++;
        }
    }
    
    public void contarConsonantes(String linea)
    {
        for(int j=0; j<linea.length(); j++)
        {
            if((Character.isLetter(linea.charAt(j))) && (!esVocal(linea.charAt(j)))) contadorC++;
        }
    }
    
    public static boolean esVocal(char c)
    {
        if((Character.toLowerCase(c)=='a') || (Character.toLowerCase(c)=='e') || (Character.toLowerCase(c)=='i') || (Character.toLowerCase(c)=='o') || (Character.toLowerCase(c)=='u')) return true;
        else return false;
    }

    public double getContadorV() {
        return contadorV;
    }

    public double getContadorC() {
        return contadorC;
    }
}