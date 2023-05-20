/**
 * This software is part of a educational program aimed to young peaple in social risk.
 * @author Thiago B. Ribeiro
 * @version 1.0
 **/

package packCriptografia;

import packCriptografia.Criptografia;

/**
 * Main class.
 **/
public class main {
	
	/**
	 * Main method.
	 **/
	public static void main(String args[]) {
		
		Criptografia guardarSegredo = new Criptografia();
		
		guardarSegredo.encriptar();
		guardarSegredo.desencriptar();
			
	}
	
}