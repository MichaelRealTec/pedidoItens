package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	// Cient = Cliente
	
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Atributos
	private String name;
	private String email;
	private Date birthDate;
	
	// Método Getter e Setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	// Método Construtor
	public Client() {
		
	}
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	// Método
	
	@Override
	public String toString() {
		return name
				+ " ("
				+ sdf.format(birthDate) + ") - "
				+ email				
				;
	}
	
}
