package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Hospital {

	private String nombre;
	private HashSet<Paciente> listaPaciente;
	
	
	public Boolean agregoPaciente(Paciente paciente1){
		return listaPaciente.add(paciente1);
		
	}
	public Boolean AltaPaciente(Paciente paciente1) {
		return listaPaciente.remove(paciente1);
	}
	
	
	
	public Paciente buscoPaciente(Integer dni) {
		Paciente paciente1 = null;
		for(Paciente e: listaPaciente) {
			if(e.getDni().equals(dni)) {
				paciente1= e;	
				break;
				}else {
					paciente1= null;
					break;
					
				}
		}
		return paciente1;
	}
	
	
	public Integer contadorDePacientesEnHospital() {
		return listaPaciente.size();
	}
	
	public Hospital(String nombre) {
		this.nombre = nombre;
		this.listaPaciente = new HashSet<Paciente>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public HashSet<Paciente> getListaPaciente() {
		return listaPaciente;
	}
	public void setListaPaciente(HashSet<Paciente> listaPaciente) {
		this.listaPaciente = listaPaciente;
	}
	
	
}
