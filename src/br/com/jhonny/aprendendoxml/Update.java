package br.com.jhonny.aprendendoxml;

import java.io.FileOutputStream;

import org.jdom2.Document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Update {
	
	private Document doc;
	private String xml;
	
	public Update(Document doc, String xml) {
		this.doc = doc;
		this.xml = xml;
	}
	
	public void update() throws Exception {
		XMLOutputter xmlOutputter = new XMLOutputter();
		xmlOutputter.setFormat(Format.getPrettyFormat());

		try (FileOutputStream fos = new FileOutputStream(xml)) {
			xmlOutputter.output(doc, fos);
		}
	}

}
