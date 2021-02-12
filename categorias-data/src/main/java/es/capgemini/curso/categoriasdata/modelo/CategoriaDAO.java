package es.capgemini.curso.categoriasdata.modelo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.capgemini.curso.categoriasdata.modelo.entidades.Categoria;
import es.capgemini.curso.categoriasdata.modelo.entidades.Producto;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer>{
	public Categoria findByIdCategoria(int idCategoria);
	public List<Producto> findProductosByIdCategoria(int idCategoria);
	public List<Categoria> findAll();
}
