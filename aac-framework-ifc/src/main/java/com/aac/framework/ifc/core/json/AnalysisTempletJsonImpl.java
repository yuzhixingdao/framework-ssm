package com.aac.framework.ifc.core.json;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.aac.framework.common.util.json.GsonUtil;
import com.aac.framework.ifc.core.AnalysisTemplet;
import com.google.gson.Gson;

/**
 * 
 * @author Xiaoqiang Shen
 * @date 2016��7��7�� ����4:43:48
 *
 */
public class AnalysisTempletJsonImpl implements AnalysisTemplet {

	private Log log = LogFactory.getLog(this.getClass());

	public String analysis(String data, Map<String, String> parameters) {

		Response r = new Response();
		r.setResponseCode("0");

		Gson gson = GsonUtil.createGson();
		String requestData = data;

		Request requestObject = null;
		String requestCode = null;

		try {

			log.info("request data:" + requestData);

			requestObject = gson.fromJson(requestData, Request.class);
			if (requestObject != null) {
				requestCode = requestObject.getRequestCode();

				try {
					if (requestCode != null) {

						WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
						IFCService busService = (IFCService) wac.getBean("ifc_" + requestCode);
						if (busService != null) {

							r = busService.execute(requestData);
							r.setRequestCode(requestCode);

						} else {
							r.setResponseCode("0");
							r.setErrorMessage("request not code��" + requestCode);
						}
					} else {
						r.setResponseCode("0");
						r.setErrorMessage("request parameter is null");
					}
				} catch (Exception e) {
					r.setResponseCode("0");
					r.setErrorMessage("service error:" + e.getMessage());
					e.printStackTrace();
				}
			} else {
				r.setResponseCode("0");
				r.setErrorMessage("no input request data");
			}
		} catch (Exception e1) {
			r.setResponseCode("0");
			r.setErrorMessage("service error:" + e1.getMessage());
			e1.printStackTrace();
		} finally {
			try {
				String retData = GsonUtil.toJson(r);
				log.info("return data:" + retData);
				return retData;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
