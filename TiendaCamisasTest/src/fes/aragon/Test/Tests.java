package fes.aragon.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import fes.aragon.camisa.camisa;
import fes.aragon.tienda.tienda;

public class Tests {
	camisa camisaM = new camisa();
	camisa camisaC = new camisa();
	camisa camisaF = new camisa();
	tienda local = new tienda();
	@Test
	public void TestCMC() {		
		camisaM = local.CMC();
	}@Test
	public void TestCCML() {
		camisaC = local.CCML();
	}@Test
	public void TestCFML() {
	
		camisaF = local.CFML();
	}@Test
	public void TestAñadirAlCarritoCamisa() {
		local.AñadirAlCarrito(camisaC);
	}@Test
	public void TestAñadirAlCarritoCamisaInt() {
		local.AñadirAlCarrito(camisaM, 4);
	}@Test
	public void TestCheckOut() {
		double expected = 0.0;
		tienda local = new tienda();
		//TotalPagar
		local.CheckOut();
		Assert.assertEquals(expected, local.getPreciototal(), 0.0);		
	}@Test
	public void TestVaciarCarrito() {
		local.VaciarCarrito();
	}@Test
	public void TestComprarMenosde3() {
		camisaM = local.CMC();
		camisaC = local.CCML();
		camisaF = local.CFML();
		double exp = 500.0;
		local.AñadirAlCarrito(camisaF);
		local.AñadirAlCarrito(camisaM);
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),exp,0.0);
	}@Test
	public void TestComprarDe3a5() {
		camisaM = local.CMC();
		camisaC = local.CCML();
		camisaF = local.CFML();
		local.AñadirAlCarrito(camisaF);
		local.AñadirAlCarrito(camisaM);
		local.AñadirAlCarrito(camisaC);
		local.CheckOut();
	}@Test
	public void TestComprar5() {
		camisaM = local.CMC();
		camisaC = local.CCML();
		camisaF = local.CFML();
		
		local.AñadirAlCarrito(camisaF,2);
		local.AñadirAlCarrito(camisaM,2);
		local.AñadirAlCarrito(camisaC);
		
		local.CheckOut();
	}@Test
	public void TestComprar8() {
		camisaM = local.CMC();
		camisaC = local.CCML();
		camisaF = local.CFML();
		local.AñadirAlCarrito(camisaF,2);
		local.AñadirAlCarrito(camisaM,2);
		local.AñadirAlCarrito(camisaC,4);
		local.CheckOut();
	}@Test
	public void TestComprar20() {
		camisaM = local.CMC();
		camisaC = local.CCML();
		camisaF = local.CFML();
		local.AñadirAlCarrito(camisaF,10);
		local.AñadirAlCarrito(camisaM,5);
		local.AñadirAlCarrito(camisaC,5);
		local.CheckOut();
	}@Test
	public void TestArrepentimiento() {
		camisaM = local.CMC();
		camisaC = local.CCML();
		camisaF = local.CFML();
		local.AñadirAlCarrito(camisaF,10);
		local.AñadirAlCarrito(camisaM,5);
		local.AñadirAlCarrito(camisaC,5);
		local.VaciarCarrito();
		local.CheckOut();
	}@Test
	public void TestComprar20expected() {
		double expected = 4784.0;
		camisaM = local.CMC();
		camisaC = local.CCML();
		camisaF = local.CFML();
		local.AñadirAlCarrito(camisaF,10);
		local.AñadirAlCarrito(camisaM,5);
		local.AñadirAlCarrito(camisaC,5);
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
	}@Test
	public void TestComprarPocos() {
		double expected = 310.0;
		camisaF = local.CFML();
		local.AñadirAlCarrito(camisaF);
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
	}@Test
	public void TestComprarPocos2() {
		double expected = 230.0;
		camisaC = local.CCML();
		local.AñadirAlCarrito(camisaC);
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
	}@Test
	public void TestComprarPocos3() {
		double expected = 190.0;
		camisaM = local.CMC();
		local.AñadirAlCarrito(camisaM);
		local.CheckOut();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
	}@Test
	public void TestErrorCamisa() {
		double expected = 190.0;
		camisaM = local.CCML();
		local.AñadirAlCarrito(camisaM);
		local.CheckOut();
		Assert.assertEquals("Es incorrecto",expected, local.getPreciototal(),0.0);
	}
	
	
	
	
	
	
	
}
