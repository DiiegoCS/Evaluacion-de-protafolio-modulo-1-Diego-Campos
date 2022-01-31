package Testing;

import static org.junit.Assert.*;



import org.junit.BeforeClass;
import org.junit.Test;

import Model.Automovil;
import Model.Vehiculo;


public class AutomovilTest {

		static Automovil auto1;
	@BeforeClass
	public static void BeforeClass() {
		auto1 = new Automovil("ppp12", "toyota", "azul", 40000, 4, 50);
		
	}
	
		
	@Test
	public void MostrarDatosTest() {
		String aux = auto1.mostrarDatos();
		assertEquals(auto1.mostrarDatos(), aux);
	}

	
	@Test
	public void ObtenerDescuentoTest() {
		
		int descuento = auto1.obtenerDescuento(20);
		assertEquals((int)(auto1.getCostoServicio()*0.2), descuento);
		
	}
	
	@Test
	public void UltimoTest() {
		Vehiculo aux = new Automovil();
		assertNotSame(auto1, aux);
	}

	
}
