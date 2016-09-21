package com.aac.framework.ifc.core.xml;

public interface Translator<P> {

	public String serialize(P request);

	public P deserialize(String xml);

}
