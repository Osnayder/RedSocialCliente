/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cecar.modelo;

import java.io.Serializable;

/** Clase: 
 * 
 * @version: 1.0
 *  
 * @sincelejo: 21/08/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */

public class Archivo implements Serializable{

    private static final long serialVersionUID = 1000L;
    private Object objecto;
    private String OperacionEnvio;
    private int operacionInterna;

    public Archivo(String OperacionEnvio, int operacionInterna, Object objecto) {
        this.objecto = objecto;
        this.OperacionEnvio = OperacionEnvio;
        this.operacionInterna = operacionInterna;
    }
	
    
}