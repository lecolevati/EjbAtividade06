/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package br.ejb;

import javax.ejb.Stateful;

/**
 *
 * @author Leandro Colevati dos Santos
 */
@Stateful
public class EjbResultado {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void verificaResultado(long soma, int res) {
        System.out.println(soma + " " + res);
    }
    
}
