/**
 * This software is part of a educational program aimed to young peaple in social risk.
 * @author Thiago B. Ribeiro
 * @version 1.0
 **/

package packCriptografia;

import java.util.Scanner; 

/**
 * Crypt class.
 **/
public class Criptografia {

	Scanner in = new Scanner(System.in);
	private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String textoOriginal = ""; 
	private String textoCifrado = "";
	private int chave = (int) (Math.random() * 25 + 1);
	private int posCaracterOriginalAlfabeto;
	private int posCaracterCifradoAlfabeto;
	private int posCaracterOriginal;
	private int posCaracterCifrado;

	/**
	 * This function encrypt a text (without accents), based in cypha's Cesar.
	 **/
	public void encriptar() {

		System.out.print("Entre com o texto para criptografar: "); 
		textoOriginal = in.nextLine().toUpperCase();     
		
		if(!textoCifrado.isEmpty()){
			textoCifrado = "";
		}
		
		for(int i = 0; i < textoOriginal.length(); i++) { 

			posCaracterOriginalAlfabeto = alfabeto.indexOf(textoOriginal.charAt(i)) ;      

			if(posCaracterOriginalAlfabeto == -1) { 
				textoCifrado += textoOriginal.charAt(i);
				continue; 
			} 

			posCaracterCifrado = (posCaracterOriginalAlfabeto + chave) % 26; 
			textoCifrado += alfabeto.charAt(posCaracterCifrado); 

		}   

		System.out.println("Texto criptografado: " + textoCifrado);
		System.out.println("Chave de criptografia: " + chave);
		System.out.println("\n*****************************************\n");

	}

	/**
	 * This function decrypt a text (without accents), based in cypha's Cesar.
	 **/
	public void desencriptar() {

		System.out.print("Entre com o texto cifrado: "); 
		textoCifrado = in.nextLine().toUpperCase();

		System.out.print("Entre com a chave para descriptografar: "); 
		chave = in.nextInt();

		if(!textoOriginal.isEmpty()){
			textoOriginal = "";
		}
		
		for(int i = 0; i < textoCifrado.length(); i++) { 
			
			posCaracterCifradoAlfabeto = alfabeto.indexOf(textoCifrado.charAt(i)) ;      

			if(posCaracterCifradoAlfabeto == -1) { 
				textoOriginal += textoCifrado.charAt(i); 
				continue; 
			}       

			posCaracterOriginal = (posCaracterCifradoAlfabeto - chave + 26) % 26; 
			textoOriginal += alfabeto.charAt(posCaracterOriginal); 
			
		}

		System.out.println("Texto original: " + textoOriginal);
		System.out.println("Tamanho do texto original: " + textoOriginal.length());
		System.out.println("\n*****************************************\n");
		
	}

}