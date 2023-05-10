package fes.aragon.tienda;

import java.util.ArrayList;
import java.util.Iterator;

import fes.aragon.camisa.camisa;

public class tienda {
	private ArrayList<camisa> carrito = new ArrayList<>();
	private double PT = 0;
	public double getPreciototal() {
		return PT;
	}
	public camisa CMC() {
		camisa CMC = new camisa();
		CMC.setDesc("Camisa de Manga Corta");
		CMC.setId(1);
		CMC.setPrecio(190);
		return CMC;
	}
	public camisa CCML() {
		camisa CCMC = new camisa();
		CCMC.setDesc("Camisa Casual de Manga Larga");
		CCMC.setId(2);
		CCMC.setPrecio(230);
		return CCMC;
	}
	public camisa CFML() {
		camisa CFML = new camisa();
		CFML.setDesc("Camisa Formal de Manga Larga");
		CFML.setId(3);
		CFML.setPrecio(310);
		return CFML;
	}
	public void AñadirAlCarrito(camisa c) {
		carrito.add(c);
	}
	public void AñadirAlCarrito(camisa c, int num) {
		for (int i = 0; i < num; i++) {
			carrito.add(c);
		}
	}
	public void VaciarCarrito() {
		carrito.clear();
	}
	public void CheckOut() {
		Iterator<camisa> it = carrito.iterator();
		double TotalPagar = 0;
		int numCamis = 0;
		while (it.hasNext()) {
			camisa c = it.next();
			System.out.println(c.getDesc());
			System.out.println(c.getPrecio());
			TotalPagar = TotalPagar + c.getPrecio();
			numCamis++;
		}
		System.out.println("El total a pagar es de: $" + TotalPagar);
		PT = TotalPagar;
		if (3 <= numCamis && numCamis <= 5) {
			System.out.println("Obtienes un descuento del %5");
			System.out.println("Descuento: $" + TotalPagar * 0.05);
			TotalPagar = TotalPagar - (TotalPagar * 0.05);
			System.out.println("Nuevo total a pagar: $" + TotalPagar);
			PT = TotalPagar;
		}else if(numCamis > 5) {
			System.out.println("Obtienes un descuento del %8");
			System.out.println("Descuento: $" + TotalPagar * 0.08);
			TotalPagar = TotalPagar - (TotalPagar * 0.08);
			System.out.println("Nuevo total a pagar: $" + TotalPagar);
			PT = TotalPagar;
		}
	}
	
}

