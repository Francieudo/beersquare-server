package br.quixada.beersquare.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.quixada.beersquare.model.Bar;
import br.quixada.beersquare.model.Checkin;
import br.quixada.beersquare.model.RodadaAmigos;
import br.quixada.beersquare.model.Usuario;


public class CriarTabelas {

	public static void exportarEsquema(List<Class<? extends Object>> classes)
	{
		AnnotationConfiguration annotConfig = adicionaClassesConfiguracao(classes);
		
		SchemaExport se = new SchemaExport(annotConfig);
		se.create(true, true);
	}

	private static AnnotationConfiguration adicionaClassesConfiguracao(List<Class<? extends Object>> classes) 
	{
		AnnotationConfiguration annotConfig = new AnnotationConfiguration();
		
		for (Class<?> classe : classes) {
			annotConfig.addAnnotatedClass(classe);
	}
	return annotConfig;
}

	public static Session prepararSessao() 
	{
		AnnotationConfiguration annotConfig = adicionaClassesConfiguracao(initialize());
		SessionFactory sf = annotConfig.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}

	public static void reiniciaBanco() 
	{
		exportarEsquema(initialize());
	}

	 private static List<Class<? extends Object>> initialize()
	{
		List<Class<? extends Object>> classes = new ArrayList<Class<? extends Object>>();
		
		classes.add(Usuario.class);
		classes.add(Bar.class);
		classes.add(Checkin.class);
		classes.add(RodadaAmigos.class);
		
		return classes;
	}
}
