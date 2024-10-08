/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.ejb.EjbCalc;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Leandro Colevati dos Santos
 */
@Named(value = "jsfCalc")
@RequestScoped
public class JsfCalc {
    
    @EJB
    private EjbCalc ejbCalc;

    /**
     * Creates a new instance of JsfCalc
     */
    public JsfCalc() {
    }

    public int[] geraValores() {
        return ejbCalc.geraValores();
    }
}
