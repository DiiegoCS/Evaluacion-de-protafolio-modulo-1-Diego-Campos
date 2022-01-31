package Testing;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Model.Automovil;
import Model.Motocicleta;

public class MotocicletaTest {

	static Motocicleta moto1;
	@BeforeClass
	public static void BeforeClass() {
		moto1 = new Motocicleta( "rrr123", "PP", "negro", 30000, "deportiva", 9);
		
	}
	
	
	@Test
	public void totalConIvaTest() {
		int resultado = (int)(moto1.getCostoServicio() * moto1.IVA);
		assertEquals(5700, resultado);
	}
	
	@Test
	public void ValidarObjsTest() {
		Automovil aux = new Automovil();
		assertNotEquals(aux, moto1);
	}
	
	@Test
	public void ValidarMotoTest() {
		
		assertNotNull(null, moto1);
	}
}
