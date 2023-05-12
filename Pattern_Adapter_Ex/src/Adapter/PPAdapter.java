package Adapter;

public class PPAdapter implements MPay {
	
	PPay ppay;
	
	public PPAdapter(PPay ppay) {
		this.ppay = ppay;
	}

	@Override
	public String getCreditCardNo() {
		// TODO Auto-generated method stub
		return ppay.getCustCardNo();
	}

	@Override
	public String getCustomerName() {
	
		return ppay.getCardOwnerName();
	}

	@Override
	public String getCardExpMonth() {
		// TODO Auto-generated method stub
		return ppay.getCardExpMonthDate();
	}

	@Override
	public String getCardExpYear() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Short getCardCVVNo() {
		int vIn = ppay.getCVVNo();
		short vOut = (short)vIn;
		// TODO Auto-generated method stub
		return vOut;
	}

	@Override
	public Double getAmount() {
		// TODO Auto-generated method stub
		return ppay.getTotalAmount();
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		ppay.setCustCardNo(creditCardNo);
		
	}

	@Override
	public void setCustomerName(String customerName) {
		ppay.setCardOwnerName(customerName);
		
	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		ppay.setCardExpMonthDate(cardExpMonth);
		
	}

	@Override
	public void setCardExpYear(String cardExpYear) {
		//ppay.setCardExpMonthDate(cardExpYear);
		
	}

	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		short vIn = cardCVVNo;
		int vOut = (int)vIn;
		ppay.setCVVNo(vOut);
		
	}

	@Override
	public void setAmount(Double amount) {
		ppay.setTotalAmount(amount);
		
	}

}
