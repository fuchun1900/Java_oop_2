package class9;

public class ServerTimeOutException extends Exception{
	private String reason; //异常原因
	private int port; //异常端口
	public ServerTimeOutException(String reason,int port) {
		this.reason = reason;
		this.port = port;
	}
	public String getReason() {
		return reason;
	}
	public int getPort() {
		return port;
	}
}
