import java.sql.Connection;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class javaProject{
	String name;
	String apellido;
	String direccion;
	String cargo;
	Scanner sc = new Scanner(System.in);	
	
 
	
	
	public String pedirNombre(){
		
		if(name.isEmpty()){
			System.out.println("Ingresa tu nombre");
			name = sc.nextLine();	
		
			JOptionPane.showMessageDialog(null, "No haz ingresado un nombre");
				
	}
		return name;
		
	}	


	public String pedirApellido() {
		System.out.println("Ingresa tu apellido");
		apellido = sc.nextLine();
		return apellido;
		}
	
	public String pedirDireccion() {
		System.out.println("Ingresa tu dirección");
		direccion = sc.nextLine();
		return direccion;
		
		}
	public String pedirCargo() {
		System.out.println("Ingresa tu cargo");
		cargo = sc.nextLine();
		return cargo;
	}
	public static void main (String[] args) {
		javaProject jp = new javaProject();
		jp.pedirNombre();
		
		
	}
	}

	
