package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Plato {
	private Elaboracion elaboracion1;
	private Integer idPlato;
	private ArrayList<Ingrediente> listaIngrediente;
	
	
	
	
	public Boolean agregoIngrediente(Ingrediente ingrediente1) {
		return listaIngrediente.add(ingrediente1);
	}
	
	public Boolean contieneIngrediente(String ingrediente1) {
		Boolean contiene = false;
		for(Ingrediente e: listaIngrediente) {
			if(e.getNombre().equals(ingrediente1)) {
				contiene = true;
			}else {
				contiene = false;
			}
		}
		return contiene;
	}
	
	
	
	public Plato(Elaboracion elaboracion1, Integer idPlato) {
		this.listaIngrediente = new ArrayList<Ingrediente>();
		this.elaboracion1 = elaboracion1;
		this.idPlato = idPlato;
	}
	public Elaboracion getElaboracion1() {
		return elaboracion1;
	}
	public void setElaboracion1(Elaboracion elaboracion1) {
		this.elaboracion1 = elaboracion1;
	}
	public Integer getIdPlato() {
		return idPlato;
	}
	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
	}
	public ArrayList<Ingrediente> getListaIngrediente() {
		return listaIngrediente;
	}
	public void setListaIngrediente(ArrayList<Ingrediente> listaIngrediente) {
		this.listaIngrediente = listaIngrediente;
	}
	
	
	

}
