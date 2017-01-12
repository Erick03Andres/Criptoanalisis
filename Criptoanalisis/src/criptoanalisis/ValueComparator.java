/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptoanalisis;

import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author EQUIPO
 */
public class ValueComparator implements Comparator<String>
{
    Map<String, Long> base;

    public ValueComparator(Map<String, Long> base) 
    {
        this.base = base;
    }
    
    @Override
    public int compare(String o1, String o2) 
    {
        if(base.get(o1)>=base.get(o2)) return -1;
        else return 1;
    }
    
}