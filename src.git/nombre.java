import java.util.Scanner;

import javax.swing.JOptionPane;

public class nombre {
	String name;
	int nameValido = 10;
	Scanner sc = new Scanner(System.in);

	public String PedirNombre() {
		System.out.println("Ingresa por favor tu nombre");
		name = sc.nextLine();
	
		return name;
	}	
	public String imprimirNombre() {
		System.out.println("El nombre que ingresaste es: " + " " + name.toUpperCase());
		return name;
	}
	
	public boolean validate() {
		//validar que el nombre que estoy recibiendo no este vacio
		//validar que el nombre no contenga mas de 10 chars
		//repetir el ciclo cada vez que se ingrese un nombre invalido
		PedirNombre();
		do {
			
			if(name.isEmpty()) {
				System.out.println("El campo nombre no puede estar vacio");
				System.out.println("Ingresa un nombre válido");
				name = sc.nextLine();
				
			}else {
				
			}
			if(name.length() >= nameValido) {
				System.out.println("El campo nombre no debe contener 10 o más caracteres");
				System.out.println("Ingresa un nombre válido");
				name = sc.nextLine();
			}else {
				
			}
		}while(name.isEmpty() == true || name.length()>=nameValido);
		imprimirNombre();
		return false;
	}
	public static void main(String []args) {
		nombre n = new nombre();
		n.validate();
	}
}	
