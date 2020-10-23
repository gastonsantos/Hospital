package ar.edu.unlam.pb2;

import java.util.ArrayList;

public  abstract class Paciente {
	private String nombre;
	private String apellido;
	private Integer dni;
	
	protected ArrayList<Plato> listaPlatos;
		
	public abstract Boolean come(Integer idPlato);
	
	
	public Boolean agregoPlato(Plato plato1) {
		return listaPlatos.add(plato1);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	public Paciente(String nombre, String apellido, Integer dni) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.listaPlatos = new ArrayList<Plato>();
	}
	public ArrayList<Plato> getListaPlatos() {
		return listaPlatos;
	}
	public void setListaPlatos(ArrayList<Plato> listaPlatos) {
		this.listaPlatos = listaPlatos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	

}
