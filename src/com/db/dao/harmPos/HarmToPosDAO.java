/**
 * 
 */
package com.db.dao.harmPos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.db.SqlMapClientConfigurater;
import com.db.dao.DBTestDAO;
import com.db.entity.harmPos.TreportInfo;
import com.ibatis.sqlmap.client.SqlMapClient;


/**
 * @author selly
 *
 */
public class HarmToPosDAO {


	static Logger mLogger = Logger.getLogger(DBTestDAO.class);
	SqlMapClient sqlMap = SqlMapClientConfigurater.getSqlMapInstance();
	
	

	/**
	 * 위해상품등록제품 가져오기 
	 * @return List<TreportInfo>
	 * @throws SQLException
	 */
	public List<TreportInfo> getHarmToPos() throws SQLException {
		
		return (List<TreportInfo>)sqlMap.queryForList("getHarmToPos");
		
	}
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HarmToPosDAO hdao = new HarmToPosDAO();
		
		TreportInfo trInfo = new TreportInfo();
		
		try {
			
			List<TreportInfo> list = new ArrayList();
			
			list = hdao.getHarmToPos();
			
			System.out.println(list);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
