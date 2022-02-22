package class8;

public class AppMain {
	public static void main(String args[])  {
		//创建一个房屋出租者
		Renter renter = new Renter(2000,10000);
		//创建一个房产代理人
		Deputy deputy = new Deputy();
		//房产代理人到房产市场登记
		HouseMarket.registerRenter(deputy);
		//建立房屋出租者与代理人的委托关系
		deputy.registerRenter(renter);
		//创建一个房屋租赁者
		Tenant tenant = new Tenant(20000);
		//当租赁者试图租赁租金为1800元，遭到代理人的拒绝
		tenant.rentHouse(1800);
		///当租赁者试图租赁租金为2300元，租房成功
		tenant.rentHouse(2300);
	}

}
