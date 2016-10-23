/**
 * 
 */
package com.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.db.dao.harmPos.HarmToPosDAO;
import com.db.entity.harmPos.TreportInfo;

/**
 * @author selly
 *
 */
public class HarmToPosMgr {

	private HarmToPosDAO dao;
	private static Logger mLogger = Logger.getLogger(HarmToPosMgr.class);	

	
	
	/**
	 * 
	 */
	public HarmToPosMgr() {
		super();
		// TODO Auto-generated constructor stub
		dao = new HarmToPosDAO();
	}


	
	public List<TreportInfo> getHarmToPos() throws Exception {
		
		return (List<TreportInfo>)dao.getHarmToPos();
		
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HarmToPosMgr mgr = new HarmToPosMgr();
		
		List<TreportInfo> list = new ArrayList();
		
		try {
			
			list = mgr.getHarmToPos();
			
			System.out.println(list);
			

String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+"<SOAP-ENV:Envelope "

			+"      SOAP-ENV:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\""

			+"     xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\""

			+"      xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\""

			+"      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""

			+"      xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\">"

			+"      <SOAP-ENV:Body>"

			+"              <ns1:echoString xmlns:ns1=\"http://soapinterop.org/\">"

			+"             <arg0 xsi:type=\"xsd:string\">Hello World</arg0>"

			+"             </ns1:echoString>"

			+"     </SOAP-ENV:Body>"

			+"  </SOAP-ENV:Envelope>";
System.out.println(xml);

			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
