package class9;
import java.util.Date;
public class Worker {
	private Car car;
	public Worker(Car car) {
		this.car = car;
	}
	public void gotoWork() throws LaterException{
		try {
			car.run();
		}catch(CarWrongException e) { //处理异常
			walk();
			Date date = new Date(System.currentTimeMillis());
			String reason = e.getMessage();
			throw new LaterException(date,reason); //创建一个LaterException并将其抛出
		}
	}
	public void walk() {}

}
