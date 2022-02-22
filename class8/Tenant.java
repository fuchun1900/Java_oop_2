package class8;

public class Tenant {
	private double money;
	
	public Tenant(double money) {
		this.money = money;
	}
	public boolean rentHouse(double expectedRent) {
		//从房产市场找到一个房屋出租代理
		RenterIFC renter = HouseMarket.findRenter();
		//如果代理不同意预期的租金价格则交易结束，否则继续
		if(!renter.isAgree(expectedRent)) {
			System.out.println("租房失败");
			return false;
		}
		//从存款中取出预付租金
		money -= expectedRent;
		//把租金给房屋代理
		renter.fetchRent(expectedRent);
		System.out.println("租房结束");
		return true;
	}

}
