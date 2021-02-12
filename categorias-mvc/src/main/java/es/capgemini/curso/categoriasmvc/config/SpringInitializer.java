package es.capgemini.curso.categoriasmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import es.capgemini.curso.categoriasdata.config.SpringConfig;

/*
 * Configuracion aplicacion Spring (Spring MVC incluyendo DispatcherServlet y Spring Data)
 */
public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { SpringConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
