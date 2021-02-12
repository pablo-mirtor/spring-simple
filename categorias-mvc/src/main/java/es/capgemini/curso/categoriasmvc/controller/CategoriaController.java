package es.capgemini.curso.categoriasmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import es.capgemini.curso.categoriasdata.modelo.CategoriaDAO;
import es.capgemini.curso.categoriasdata.modelo.ProductoDAO;


@Controller
public class CategoriaController {

	@Autowired
	private CategoriaDAO cdao;
	@Autowired
	private ProductoDAO pdao;
	
	@GetMapping(path = { "/", "/list" })
	public ModelAndView index() {
		return new ModelAndView("index", "categorias", cdao.findAll());
	}

	@GetMapping("/categoria/{id}")
	public ModelAndView getCategoryPage(@PathVariable Integer id) {
		return new ModelAndView("categoria", "categoria", cdao.findByIdCategoria(id));
	}
	
	
	/*@GetMapping("/update")
	public ModelAndView showFormForUpdate(@RequestParam("idCandidato") int id) {
		return new ModelAndView("candidato-edit-form", "candidato", service.getById(id)) ;
	}
	
	@PostMapping("/saveEdit")
	public String saveEditCustomer(@ModelAttribute("candidato") Candidato candidato) {
		service.edit(candidato);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("idCandidato") int id) {
		service.remove(service.getById(id).get());
		return "redirect:/list";
	}*/
}
