package br.com.jhonny.aprendendoxml;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class Program {

	public static void main(String[] args) {

		try {
			String[] nomes = new String[] { "Bruno", "Gabriel", "José", "Jhonny" };

			Element cadastros = new Element("cadastros");
			Document document = new Document(cadastros);

			for (int i = 0; i < nomes.length; i++) {
				Element pessoa = new Element("pessoa");

				Element nome = new Element("nome");
				nome.setText(nomes[i]);

				Element codigo = new Element("codigo");
				codigo.setText(String.valueOf(i));

				Attribute id = new Attribute("id", String.valueOf(i + 20));
				pessoa.setAttribute(id);

				pessoa.addContent(nome);
				pessoa.addContent(codigo);

				cadastros.addContent(pessoa);

			}
			Add add = new Add(document, "Paulo", "7");
			add.addElement();

			Delet dl = new Delet(document, "Jhonny");
			dl.deletElement();

			Update up = new Update(document, "cadastro.xml");
			up.update();

			Filter fi = new Filter("//pessoa");
			fi.select();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
