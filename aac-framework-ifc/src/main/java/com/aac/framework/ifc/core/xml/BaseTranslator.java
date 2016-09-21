package com.aac.framework.ifc.core.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class BaseTranslator<P> implements Translator<P> {
	
	protected XStream xstream = new XStream(new DomDriver());
	protected String encoding = "UTF-8";

	public BaseTranslator() {
		DateConverter converter = new DateConverter("yyyy-MM-dd HH:mm:ss", new String[]{}, true);
		xstream.registerConverter(converter);
		
		xstream.alias("packet", Packet.class);
		xstream.alias("head", Head.class);
	}

	/**
	 * 反序列化
	 */
	public P deserialize(String responseXml) {
		return (P) xstream.fromXML(responseXml);
	}

	/**
	 * 序列化
	 */
	public String serialize(P request) {
		String requestXml = xstream.toXML(request);

		requestXml = "<?xml version=\"1.0\" encoding=\"" + encoding + "\"?>\n" + requestXml;
		return requestXml;
	}

}