package entrega8.supermercado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public abstract class Carrito extends Exception{
	
	
	Scanner entrada = new Scanner(System.in);
	List<ProductoDeAlmacen> carro = new ArrayList<>();
	
	//int stockNum, int price, String name
	
	public static void agregarProducto() throws Exception{
		try(    System.out.println("Que estas comprando?");
				String name = entrada.next();
				System.out.println("Que numero de stock tiene?");
				int stockn = entrada.nextInt();
				System.out.println("Cual es su precio?");
				int precio = entrada.nextInt();
				
				ProductoDeAlmacen NewProduct = new ProductoDeAlmacen(precio, stockn, name);
				carro.add(NewProduct);
				System.out.println(carro.toString());){ catch{
		
		}
	}
	
	public void verCantidad() {
		System.out.println("Tienes un numero de " + carro.size() + " productos en total!");
	}
	
	public double total() {
		
		
		
		for(ProductoDeAlmacen s : carro) {
			System.out.println(s.getPrice());
		}
		
		
		
		return 0;
	}
	
	public void contenido() {
		
	}
	
}
