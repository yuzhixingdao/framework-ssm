package com.aac.framework.ifc.core.xml;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.aac.framework.ifc.core.AnalysisTemplet;

/**
 * 
 * @author Xiaoqiang Shen
 * @date 2016��7��7�� ����4:43:48
 *
 */
public class AnalysisTempletXmlImpl implements AnalysisTemplet {

	private Log log = LogFactory.getLog(this.getClass());

	public String analysis(String data, Map<String, String> parameters) {

		String responseData = null;
		String requestData = data;
		BaseTranslator<Packet> translator = new BaseTranslator<Packet>();
		try {

			String requestCode = getRequestCode(requestData);

			if (requestCode != null) {

				WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
				IFCService service = (IFCService) wac.getBean("xml_" + requestCode);

				if (service != null) {
					responseData = service.execute(requestData);
				} else {
					throw new Exception("���������û�������룺" + requestCode);
				}
			} else {
				throw new Exception("�޷���ȡ���������Ϣ");
			}
		} catch (Exception e) {
			Packet packet = new Packet();
			Head head = new Head();
			head.setResponseCode("0");
			head.setErrorMessage("�������쳣:���ղ���ʧ�� " + e.getMessage());
			packet.setHead(head);
			responseData = translator.serialize(packet);
		} finally {
			if (responseData == null || "".equals(responseData)) {
				Packet packet = new Packet();
				Head head = new Head();
				head.setResponseCode("0");
				head.setErrorMessage("���ýӿڷ�����δ֪����");
				packet.setHead(head);
				responseData = translator.serialize(packet);
			}
		}

		return responseData;

	}

	private String getRequestCode(String requestData) throws DocumentException {
		String requestCode = null;
		Document document = DocumentHelper.parseText(requestData);
		Element root = document.getRootElement();
		Node requestCodeElement = root.selectSingleNode("/packet/head/requestCode");

		if (requestCodeElement != null) {
			requestCode = requestCodeElement.getText();
		}
		return requestCode;
	}
}
