package br.com.jhonny.aprendendoxml;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

public class Filter {
	
	private String filter;
	
	public Filter(String filter) {
		this.filter = filter;
	}
	
	public void select() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build("cadastro.xml");
		XPathFactory xpathFactory = XPathFactory.instance();
		XPathExpression<Element> expression = xpathFactory.compile(filter, org.jdom2.filter.Filters.element());

		List<Element> elementos = expression.evaluate(doc);
		for (Element pessoa : elementos) {
			String cod = pessoa.getChildText("codigo");
			String nome = pessoa.getChildText("nome");
			System.out.println("Código: " + cod);
			System.out.println("Nome: " + nome);
		}

	}

}
