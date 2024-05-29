package br.com.jhonny.aprendendoxml;

import org.jdom2.Document;
import org.jdom2.Element;

public class Add {

	private String nomes;
	private String codigos;
	private Document doc;

	public Add(Document doc, String nomes, String codigos) {
		this.doc = doc;
		this.nomes = nomes;
		this.codigos = codigos;
	}

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public String getCodigos() {
		return codigos;
	}

	public void setCodigos(String codigos) {
		this.codigos = codigos;
	}

	public void getDoc(Document doc) {
		this.doc = doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

	public void addElement() {

		Element pessoa = new Element("pessoa");

		Element nome = new Element("nome");
		nome.setText(nomes);

		Element codigo = new Element("codigo");
		codigo.setText(String.valueOf(codigos));

		pessoa.addContent(nome);
		pessoa.addContent(codigo);

		pessoa.setAttribute("id", String.valueOf(codigos + 20));

		doc.getRootElement().addContent(pessoa);
	}

}
