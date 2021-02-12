package es.capgemini.curso.categoriasmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.capgemini.curso.categoriasdata.modelo.ProductoDAO;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private ProductoDAO dao;
	
	@GetMapping(path="")
	public ModelAndView getAllProducts() {
		return new ModelAndView("listaproductos", "productos", dao.findAll());
	}
	
	@GetMapping("/{id}")
	public ModelAndView getProductDetails(@PathVariable Integer id) {
		return new ModelAndView("producto", "producto", dao.findByIdProducto(id));
	}
}
