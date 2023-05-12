package Adapter;

public class PPACont implements PPay {

	private String CustCardNo;
	private String CardOwnerName;
	private String CardExpMonthDate;
	private Integer CVVNo;
	private Double TotalAmount;
	
	/*
	public PPACont(String custCardNo, String cardOwnerName, String cardExpMonthDate, int cVVNo, double totalAmount) {
		this.CustCardNo = custCardNo;
		this.CardOwnerName = cardOwnerName;
		this.CardExpMonthDate = cardExpMonthDate;
		this.CVVNo = cVVNo;
		this.TotalAmount = totalAmount;
	}*/

	@Override
	public String getCustCardNo() {
		// TODO Auto-generated method stub
		return this.CustCardNo;
	}

	@Override
	public String getCardOwnerName() {
		// TODO Auto-generated method stub
		return this.CardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		// TODO Auto-generated method stub
		return this.CardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		// TODO Auto-generated method stub
		return this.CVVNo;
	}

	@Override
	public Double getTotalAmount() {
		// TODO Auto-generated method stub
		return this.TotalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.CustCardNo = custCardNo;

	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.CardOwnerName = cardOwnerName;

	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.CardExpMonthDate = cardExpMonthDate;

	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.CVVNo = cVVNo;

	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.TotalAmount = totalAmount;

	}

}
