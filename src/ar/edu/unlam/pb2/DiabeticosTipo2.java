package ar.edu.unlam.pb2;

public class DiabeticosTipo2  extends Paciente{

	private Boolean insulina= false;
	
	public Boolean getInsulina() {
		return insulina;
	}

	public void setInsulina(Boolean insulina) {
		this.insulina = insulina;
	}

	public DiabeticosTipo2(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		
	}

	@Override
	public Boolean come(Integer idPlato) {
	Boolean comio= false;
	String noPuedeComer="Azucar";
	for(Plato e: listaPlatos) {
		if(e.getIdPlato().equals(idPlato)){
			if(e.contieneIngrediente(noPuedeComer)== false || insulina.equals(true)) {
				comio= true;
				break;
			}else {
				comio=false;
				break;
			}
	
		}else {
			comio= false;
		}
		}
	return comio;
	
		}
	
	
	
	public Boolean dosisInsulina() {
		insulina= true;
		return insulina;
		
	}
			
}
