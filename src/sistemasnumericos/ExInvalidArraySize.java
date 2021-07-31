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
public class ExInvalidArraySize extends Exception{

    public ExInvalidArraySize() {
        super("ARRAY SIZE CAN NOT BE LESS THAN TWO");
    }
    
}
