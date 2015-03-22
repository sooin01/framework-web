package com.my.app.api.exec.main;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public abstract class CommonMain {

	private ObjectWriter writer = new ObjectMapper().writerWithDefaultPrettyPrinter();
	
	protected RestTemplate restTemplate;
	
	protected CommonMain() {
		this("restTemplate");
	}
	
	protected CommonMain(String id) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/rest-context.xml");
		this.restTemplate = context.getBean(id, RestTemplate.class);
		context.close();
	}
	
	protected void json(Object value) {
		try {
			System.out.println(this.writer.writeValueAsString(value));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	public void xml(String value) {
	    try {
	        Source xmlInput = new StreamSource(new StringReader(value));
	        StringWriter stringWriter = new StringWriter();
	        StreamResult xmlOutput = new StreamResult(stringWriter);
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        transformerFactory.setAttribute("indent-number", 2);
	        Transformer transformer = transformerFactory.newTransformer(); 
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.transform(xmlInput, xmlOutput);
	        System.out.println("[Response]\r\n" + xmlOutput.getWriter().toString());
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	protected abstract void run();
	
}
