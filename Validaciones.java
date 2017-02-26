/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Validaciones {
    //Este metodo convierte cualquier String(cadena de texto) a int
    //Calma
    //y si genera una excepcion es decir el String contiene letras o caracteres
    //marca la variable false
    //y devuelve la variable false
    //me explico??
    //como lo hace??
    //aqui hay un sentencia que se llama try{si dentro de esta parcela ocurre excepcion}catch{la trapa en esta parcela y convierte en true el boolean}
    //tu sabes que es una excepcion?
    //por ejemplo si tienes una cadena de texto y lo decides ingresar en un int(entero)
    //se genra una esception porque son tipos de datos incomátibles
    //no lo paraliza lo atrapa en la porcion de codigo del catch{}
       
    
    public static Boolean isType(String testStr, String type) {
		try {
			if (type.equalsIgnoreCase("float")) {
				Float.parseFloat(testStr);
			} else if (type.equalsIgnoreCase("int")) {
				Integer.parseInt(testStr);
			} else if (type.equalsIgnoreCase("double")) {
				Double.parseDouble(testStr);
			}
			return true;
		} catch(Exception e) {
			return false;
		}
 
	}
 
}
    
    

