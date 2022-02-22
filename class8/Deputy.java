package class8;

public class Deputy implements RenterIFC{
	private Renter renter;
	public void registerRenter(Renter renter) {
		this.renter = renter;
	}
	public boolean isAgree(double expectedRent) {
		//如果租赁者的期望价格小于租金最低价格，则不出租
		if(expectedRent < renter.getRentDeadLine()) {
			return false;
		}
		//否则请示租房者的意见
		return renter.isAgree(expectedRent);
	}
	public void fetchRent(double rent) {
		renter.fetchRent(rent);
	}

}
