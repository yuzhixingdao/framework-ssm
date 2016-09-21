package com.aac.framework.ifc.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * init-param : encoding default UTF-8
 * 
 * @author Xiaoqiang Shen
 * @date 2016年7月18日 下午12:52:06
 *
 */
public class IFCServlet extends HttpServlet {

	private static final long serialVersionUID = -7935175342326558606L;

	private Log log = LogFactory.getLog(this.getClass());

	private String encoding = "UTF-8";
	private String templet = "analysisTemplet";

	private WebApplicationContext wac;

	public void init() throws ServletException {
		super.init();

		encoding = super.getInitParameter("encoding");
		templet = super.getInitParameter("templet");
		if (encoding == null)
			encoding = "UTF-8";
		if (templet == null)
			templet = "analysisTemplet";
		log.info("init encoding:" + encoding);
		log.info("init templet:" + templet);

		ServletContext servletContext = super.getServletContext();
		wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		String retData = "error";

		try {

			String requestData = getRequestData(request);
			Map<String, String> parameters = getParameters(request);
			log.info("request data:" + requestData);
			log.info("request data:" + parameters);

			AnalysisTemplet at = (AnalysisTemplet) wac.getBean(templet);

			retData = at.analysis(requestData, null);

		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		} finally {
			try {
				if (retData == null)
					retData = "error";
				writeResponse(response, retData);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Get����
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	/**
	 * ��ȡ���ݵĲ���
	 * 
	 * @param request
	 * @param encoding
	 * @return
	 */
	public Map<String, String> getParameters(HttpServletRequest request) {

		Map<String, String> values = new HashMap<String, String>();

		Map parameterMap = request.getParameterMap();
		Set keySet = parameterMap.keySet();
		Iterator iterator = keySet.iterator();

		while (iterator.hasNext()) {

			String name = (String) iterator.next();
			String[] value = request.getParameterValues(name);

			String vs = null;

			try {
				if (value != null && value.length > 0) {
					for (int i = 0; i < value.length; i++) {
						vs = vs == null ? "" : vs;
						vs += URLDecoder.decode(value[i], encoding);
						if (i < value.length - 1) {
							vs += ",";
						}
					}
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			values.put(name, vs);

		}

		return values;

	}

	/**
	 * ���������л�ȡ�������
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	private String getRequestData(HttpServletRequest request) throws IOException {
		InputStream is = request.getInputStream();
		byte[] buffer = new byte[2048];
		int length = 0;
		StringBuffer data = new StringBuffer();
		while ((length = is.read(buffer)) != -1) {
			data.append(new String(buffer, 0, length, encoding));
		}
		is.close();
		return data.toString();
	}

	/**
	 * ��Ӧ���
	 * 
	 * @param response
	 * @param data
	 * @throws IOException
	 */
	private void writeResponse(HttpServletResponse response, String data) throws IOException {
		response.setCharacterEncoding(encoding);

		OutputStream os = response.getOutputStream();
		os.write(data.getBytes(encoding));
		os.flush();
		os.close();
	}
}
