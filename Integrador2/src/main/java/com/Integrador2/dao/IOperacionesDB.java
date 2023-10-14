package com.Integrador2.dao;

import com.Integrador2.bo.Producto;

public interface IOperacionesDB {
	void add(Producto p);// suma productos
	void remove(int id); //resta
	void modify(int id);//quiere modificar stock precio 
	void list(int id);
	void find(int id);
}
