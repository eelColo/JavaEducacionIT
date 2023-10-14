package com.Integrador2.to;

import java.util.Scanner;

import com.Integrador2.bo.Producto;
import com.Integrador2.ds.ConectionDB;

public class MainApp {	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Producto p1 = new Producto(1, "gabriel", "elgaby", 0.01, 1);
		
		ConectionDB conex = new ConectionDB();
		
		conex.add(p1);
		
	}
}
