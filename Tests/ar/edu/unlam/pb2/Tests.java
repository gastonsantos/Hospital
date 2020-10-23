package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	 @Test
	 public void testQueAgregoPacienteAHospital() {
		 Hospital hospital1 = new Hospital ("Rodriguez");
		 Paciente paciente1 = new Hipertenso ("Gaston", "santos", 33022376);
		 assertTrue(hospital1.agregoPaciente(paciente1));
	 }
	@Test
	public void testQueDoyDeAltaUnPaciente() {
		 Hospital hospital1 = new Hospital ("Rodriguez");
		 Paciente paciente1 = new Hipertenso ("Gaston", "santos", 33022376);
		 Paciente paciente2 = new Hipertenso ("Roberto", "Carlo", 26864344);
		 hospital1.agregoPaciente(paciente1);
		 hospital1.agregoPaciente(paciente2);
		 hospital1.AltaPaciente(paciente1);
		 Integer ve = 1;
		 Integer vo = hospital1.contadorDePacientesEnHospital();
		 assertEquals(ve, vo);
	}
	@Test
	public void testQueBuscoPacienteYEncuentro() {
		Hospital hospital1 = new Hospital ("Rodriguez");
		Paciente paciente1 = new Hipertenso ("Gaston", "santos", 33022376);
		Paciente paciente2 = new Hipertenso ("Roberto", "Carlo", 26864344);
		hospital1.agregoPaciente(paciente1);
		hospital1.agregoPaciente(paciente2);
		String ve="santos";
		String vo = hospital1.buscoPaciente(33022376).getApellido();
		assertEquals(ve, vo);
	}
	
	@Test
	public void testQueBuscoPacienteYNoEncuentro() {
		Hospital hospital1 = new Hospital ("Rodriguez");
		Paciente paciente1 = new Hipertenso ("Gaston", "santos", 33022376);
		Paciente paciente2 = new Hipertenso ("Roberto", "Carlo", 26864344);
		hospital1.agregoPaciente(paciente1);
		hospital1.agregoPaciente(paciente2);
		assertNull(hospital1.buscoPaciente(9876785));
		
		
	}
	

	@Test
	public void testDeHipertensoQueVerificaQueSiPuedeComerPlato() {
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.crudo();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Lechuga");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		Hipertenso hiper1 = new Hipertenso("Gaston", "Santos", 33022376);
		hiper1.agregoPlato(plato1);
		assertTrue(hiper1.come(200));
	}
	@Test
	public void testDeHipertensoQueNoPuedeComerPlatoPorQueConteienSal() {
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.olla();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Sal");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		Hipertenso hiper1 = new Hipertenso("Gaston", "Santos", 33022376);
		hiper1.agregoPlato(plato1);
		assertFalse(hiper1.come(200));
		
		
	}
	@Test
	public void testQueHipertensoNoPuedeComerPorQueNoExistePlato() {
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.Horno();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Lechuga");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		Hipertenso hiper1 = new Hipertenso("Gaston", "Santos", 33022376);
		hiper1.agregoPlato(plato1);
		assertFalse(hiper1.come(201));
	}
	
	@Test
	public void testQueOncologicoNoComePlatosCrudos() {
		
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.crudo();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Lechuga");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		Oncologico onco1 = new Oncologico("Gaston", "Santos", 33022376);
		onco1.agregoPlato(plato1);
		assertFalse(onco1.come(200));
		
	}
	@Test
	public void testQueNoPuedeComerPlatoCeliaco() {
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.frito();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Avena");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		Celiacos celi1 = new Celiacos("Gaston", "Santos", 33022376);
		celi1.agregoPlato(plato1);
		assertFalse(celi1.come(200));
		
	}
	@Test
	public void testQuePuedeComerPlatoCeliaco() {
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.frito();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Lechuga");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		Celiacos celi1 = new Celiacos("Gaston", "Santos", 33022376);
		celi1.agregoPlato(plato1);
		assertTrue(celi1.come(200));
		
	}
	@Test
	public void testQuePuedeComerPlatoGenerales() {
		
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.crudo();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Lechuga");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		Generales gen1 = new Generales("Gaston", "Santos", 33022376);
		gen1.agregoPlato(plato1);
		assertTrue(gen1.come(200));
		
	}
	
	@Test
	public void testQueDiabeticoTipoDosPuedeComerRecibioSuDosisDiariaDeInsulinaYNoTieneAzucar() {
		
		
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.olla();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Lechuga");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		DiabeticosTipo2 diabetico1 = new DiabeticosTipo2 ("Gaston", "Santos", 33022376);
		diabetico1.agregoPlato(plato1);
		diabetico1.dosisInsulina();
		assertTrue(diabetico1.come(200));
	}
	
	
	
	public void testQueNoPuedeComerPorQueNoRecibioSuInsulinaYNoTieneAzucar() {
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.frito();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Lechuga");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		DiabeticosTipo2 diabetico1 = new DiabeticosTipo2 ("Gaston", "Santos", 33022376);
		diabetico1.agregoPlato(plato1);
		
		assertFalse(diabetico1.come(200));
		
	}
	public void testQueNoPuedeComerPorQueElPlatoTieneAzucarYTieneLaDosisDeInsulina() {
		
		Elaboracion elaboracion1 = new Elaboracion();
		elaboracion1.Horno();
		Plato plato1 = new Plato(elaboracion1,200);
		Ingrediente ingredient1 = new Ingrediente ("Tomate");
		Ingrediente ingredient2 = new Ingrediente ("Azucar");
		plato1.agregoIngrediente(ingredient1);
		plato1.agregoIngrediente(ingredient2);
		DiabeticosTipo2 diabetico1 = new DiabeticosTipo2 ("Gaston", "Santos", 33022376);
		diabetico1.agregoPlato(plato1);
		diabetico1.dosisInsulina();
		assertFalse(diabetico1.come(200));
		
		
	}
	
}
