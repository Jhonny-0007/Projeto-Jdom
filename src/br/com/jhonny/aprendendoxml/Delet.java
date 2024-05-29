package br.com.jhonny.aprendendoxml;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;

public class Delet {

	private Document doc;
	private String nomes;

	public Delet(Document doc, String nomes) {
		this.doc = doc;
		this.nomes = nomes;
	}

	public void deletElement() {
		Element cadastros = doc.getRootElement();
		List<Element> pessoa = cadastros.getChildren("pessoa");

		for (int i = 0; i < pessoa.size(); i++) {
			Element nome = pessoa.get(i);
			Element nomeElement = nome.getChild("nome");

			if (nomeElement != null && nomeElement.getTextNormalize().equals(this.nomes)) {
				cadastros.removeContent(nome);
				break;
			}
		}
	}
}
