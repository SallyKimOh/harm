/**
 * 
 */
package com.db.dao;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.db.SqlMapClientConfigurater;
import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author sitoo
 *
 */
public class DBTestDAO {

	static Logger mLogger = Logger.getLogger(DBTestDAO.class);
	SqlMapClient sqlMap = SqlMapClientConfigurater.getSqlMapInstance();
	
	/**
	 * 날짜 테스트 
	 * @return
	 * @throws SQLException
	 */
	public String getTestDate() throws SQLException {
		return (String)sqlMap.queryForObject("getTestDate");
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBTestDAO dao = new DBTestDAO();
//		DepositInfo info = new DepositInfo();
		
		
		
		try {
			
System.out.println("ADFADSF");			
			//====== 테스트 =======//
			String testDate = dao.getTestDate();
			System.out.println(testDate);

/*			
			//======= 예치금 상태 ============//
			info = (DepositInfo)dao.getDepositInfo(Long.parseLong("5"));
			System.out.println(info);
			mLogger.info(info);

*/
/*			
			//=========== 예치금 상태 변화 ===========//
			info.setDeposit(150);
			Integer flagType = dao.updateDepositAccount(info);
			System.out.println(flagType);
*/
/*			
			//=========== 예치금 상태 리스트로 변화 ===========//
			List depositList = new ArrayList();
			List list = new ArrayList();
			info = new DepositInfo();
			info.setAdvSeq(Long.parseLong("1"));
			info.setDeposit(-100);
			list.add(info);
			info = new DepositInfo();
			info.setAdvSeq(Long.parseLong("2"));
			info.setDeposit(0);
			info.setEventMoney(1400);
			list.add(info);
			info = new DepositInfo();
			info.setAdvSeq(Long.parseLong("3"));
			info.setDeposit(-560);
			list.add(info);
			
			System.out.println(list);
			mLogger.info(list);
			depositList = dao.getDepositAccountListResult(list);
			System.out.println(depositList);
			System.out.println(depositList.get(0).toString());
*/			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
