package com.Integrador2.ds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.Integrador2.bo.Producto;
import com.Integrador2.dao.IOperacionesDB;

public class ConectionDB implements IOperacionesDB{
	
	 static Connection c = null;
	
	//Genera coneccion con almacen en local host y retorna la misma conexion
	public static Connection conectar() {
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost/almacen", "root", "");
			System.out.println("¡Exito al conectarse con la Base de Datos almacen!");
		} catch (Exception e) {
			System.out.println("Error al conectar con base de datos. " + e.getMessage());
		}
		return c;
	}

	
	
	
	
	
	
	//Mamita se viene el rompecabezas
	
	//Variables que se van a usar en la implementacion
	String sql = "";
	PreparedStatement stmt = null;
	Connection conexion = ConectionDB.conectar();
	
	
	
	@Override
	public void add(Producto p) {
		try {
			
			
			//seteamos el sql para insert
			sql = "INSERT INTO productos VALUES(?,?,?,?,?)";
			//preparamos el statement
			stmt = conexion.prepareStatement(sql);
			//insertamos datos
			stmt.setInt(1, p.getCodigo());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getDescripcion());
			stmt.setDouble(4, p.getPrecio());
			stmt.setInt(5, p.getStock());
			
			
			
			//ejecutamos el statement completo
			
			stmt.execute();
			
			
			
			//manejo de excepcion
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Cerrando conexion");
			try {
				if(stmt !=  null) {
					stmt.close();
				}
				if(conexion !=  null) {
					conexion.close();
				}
			} catch (Exception e) {
				System.out.println("Error cerrando base de datos. " + e.getMessage());
			}
		}
		
	}


	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void modify(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void list(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void find(int id) {
		// TODO Auto-generated method stub
		
	}

	
	

}
