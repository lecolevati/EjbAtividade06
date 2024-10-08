/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.ejb.EjbResultado;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Leandro Colevati dos Santos
 */
@Named(value = "jsfResultado")
@SessionScoped
public class JsfResultado implements Serializable {
    
    private String nome;
    private int res;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
    @EJB
    private EjbResultado ejbResultado;

    /**
     * Creates a new instance of JsfResultado
     */
    public JsfResultado() {
    }
    
    public void verifcaResultado(long soma) {
        ejbResultado.verificaResultado(soma, res);
    }
    
}
