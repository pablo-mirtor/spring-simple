package es.capgemini.curso.categoriasdata.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.capgemini.curso.categoriasdata.modelo.entidades.Producto;

@Repository
public interface ProductoDAO extends JpaRepository<Producto, Integer>{
	public Producto findByIdProducto(int id);
	
}
