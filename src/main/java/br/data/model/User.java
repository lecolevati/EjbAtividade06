/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Leandro Colevati dos Santos
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String nome;
    private int qtdAcertos;
}
