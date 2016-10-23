/**
 * 
 */
package com.db.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;



/**
 * @author sitoo
 *
 */
public class DepositInfo {

	private Long depositSeq; 		//��ġ���ڵ�
	private String paymentType;			//���ĺұ����ֿ���
	private double deposit;			//�ǿ�ġ��
	private double eventMoney;			//�̺�Ʈ�Ӵ�
	private Long creditLine;			//�ſ��ѵ�
	private double creditPrice;		//���űݾ�
	private Long advSeq;				// ������ seq
	private String priceType;			//��ġ��,�̺�Ʈ �Ӵ�
	private String depositType;			//�Һ�������(benefit),����(account)
//	private Integer code;			//�������а�� �ڵ�
//	private String msg;				//�������а�� �޽���
	private double accountPrice;	//���� �ݾ�
	private String resultCode;		//����ڵ�
	private String resultMsg;		//����޽���
	private String accountKind;		//��,����
	private String accountForm;		//cpc,��ġ��,�Һ�������, �̺�Ʈ �Ӵ�
	

	/**
	 * 
	 */
	public DepositInfo() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	

	/**
	 * @return the depositSeq
	 */
	public Long getDepositSeq() {
		return depositSeq;
	}






	/**
	 * @param depositSeq the depositSeq to set
	 */
	public void setDepositSeq(Long depositSeq) {
		this.depositSeq = depositSeq;
	}






	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}






	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}






	/**
	 * @return the deposit
	 */
	public double getDeposit() {
		return deposit;
	}






	/**
	 * @param deposit the deposit to set
	 */
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}






	/**
	 * @return the eventMoney
	 */
	public double getEventMoney() {
		return eventMoney;
	}






	/**
	 * @param eventMoney the eventMoney to set
	 */
	public void setEventMoney(double eventMoney) {
		this.eventMoney = eventMoney;
	}






	/**
	 * @return the creditLine
	 */
	public Long getCreditLine() {
		return creditLine;
	}






	/**
	 * @param creditLine the creditLine to set
	 */
	public void setCreditLine(Long creditLine) {
		this.creditLine = creditLine;
	}






	/**
	 * @return the creditPrice
	 */
	public double getCreditPrice() {
		return creditPrice;
	}






	/**
	 * @param creditPrice the creditPrice to set
	 */
	public void setCreditPrice(double creditPrice) {
		this.creditPrice = creditPrice;
	}






	/**
	 * @return the advSeq
	 */
	public Long getAdvSeq() {
		return advSeq;
	}






	/**
	 * @param advSeq the advSeq to set
	 */
	public void setAdvSeq(Long advSeq) {
		this.advSeq = advSeq;
	}




	


	/**
	 * @return the priceType
	 */
	public String getPriceType() {
		return priceType;
	}






	/**
	 * @param priceType the priceType to set
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}






	/**
	 * @return the depositType
	 */
	public String getDepositType() {
		return depositType;
	}






	/**
	 * @param depositType the depositType to set
	 */
	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}









	/**
	 * @return the code
	 */
//	public Integer getCode() {
//		return code;
//	}






	/**
	 * @param code the code to set
	 */
//	public void setCode(Integer code) {
//		this.code = code;
//	}






	/**
	 * @return the msg
	 */
//	public String getMsg() {
//		return msg;
//	}






	/**
	 * @param msg the msg to set
	 */
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}






	/**
	 * @return the accountPrice
	 */
	public double getAccountPrice() {
		return accountPrice;
	}






	/**
	 * @param accountPrice the accountPrice to set
	 */
	public void setAccountPrice(double accountPrice) {
		this.accountPrice = accountPrice;
	}






	/**
	 * @return the resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}






	/**
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}






	/**
	 * @return the resultMsg
	 */
	public String getResultMsg() {
		return resultMsg;
	}






	/**
	 * @param resultMsg the resultMsg to set
	 */
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}






	/**
	 * @return the accountKind
	 */
	public String getAccountKind() {
		return accountKind;
	}






	/**
	 * @param accountKind the accountKind to set
	 */
	public void setAccountKind(String accountKind) {
		this.accountKind = accountKind;
	}






	/**
	 * @return the accontForm
	 */
	public String getAccountForm() {
		return accountForm;
	}






	/**
	 * @param accontForm the accontForm to set
	 */
	public void setAccountForm(String accountForm) {
		this.accountForm = accountForm;
	}






	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	
	
}
