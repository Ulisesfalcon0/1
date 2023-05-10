package fes.aragon.inicio;

import fes.aragon.camisa.camisa;
import fes.aragon.tienda.tienda;

public class main {
	public static void main(String[] args) {
		camisa camisaM = new camisa();
		camisa camisaC = new camisa();
		camisa camisaF = new camisa();
		tienda local = new tienda();
		camisaM = local.CMC();
		camisaC = local.CCML();
		camisaF = local.CFML();
		local.AñadirAlCarrito(camisaM, 4);
		local.AñadirAlCarrito(camisaC);
		local.AñadirAlCarrito(camisaF);
		local.AñadirAlCarrito(camisaM);
		local.CheckOut();
	}
} 
