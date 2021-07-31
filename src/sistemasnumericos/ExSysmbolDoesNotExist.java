/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasnumericos;

/**
 *
 * @author Luis Roberto Peña
 */
public class ExSysmbolDoesNotExist extends Exception{

    public ExSysmbolDoesNotExist() {
        super("AN INGRESED SYMBOL WAS NOT FOUND");
    }
    
}
