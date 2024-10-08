/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Leandro Colevati dos Santos
 */
@Stateless
public class EjbCalc {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    
//    public boolean validaOperacao(int soma, int res) {
//        return soma == res;
//    }

    public int[] geraValores() {
        int[] val = new int[3];
        val[0] = 100; //(int)((Math.random() * 100) + 1);
        val[1] = 20; //(int)((Math.random() * 100) + 1);
        val[2] = val[0] + val[1];
        System.err.println(val[2]);
        return val;
    }
    
}
