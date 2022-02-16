
package LogicaNegocio;

import java.util.Random;

public class Password {
   int tamano;
	String contrasena=" ";

	public String generarContrasena()
	{
		tamano = 8;

		Random rnd = new Random();
		int valor;
		// generar la cadena con caracteres a aleatorios
		for (int i = 0; i < tamano; i++)
		{
			// generar numeros aleatorios
			valor = rnd.nextInt(4);// genera numeros del 0 al 3
			switch (valor)
			{
				case 0:
					contrasena += genMay();
					break;
				case 1:
					contrasena += genMin();
					break;
				case 2:
					contrasena += genCar();
					break;
				case 3:
					contrasena += genNum();
					break;
				default:

			}
			
		}
		return contrasena;
		

	}

	public char genMay()
	{
		// Letras mayusculas
		return (char) (Math.random() * 26 + 'A');

	}

	public char genMin()
	{
		// Letras minusculas
		return (char) (Math.random() * 26 + 'a');

	}

	public int genNum()
	{
		// Numeros aleatorios
		Random nume = new Random();
		return nume.nextInt(10);

	}

	public char genCar()
	{
		// Caracteres especiales
		Random ran = new Random();
		String setOfCharacters = "@#$%&*_-*+";
		int randomInt = ran.nextInt(setOfCharacters.length());
		char randomChar = setOfCharacters.charAt(randomInt);
		return randomChar;
	}
}
