package class4;

public class BitMover {
	//交换高4位与低4位低位置，如0001010 -> 10100000
	public static byte swap(byte b) {
		int lowBits = b & 0xF; //获得低4位
		int highBits = b & 0xF0; //获得高4位
		
		int result = lowBits << 4 | highBits >>> 4;
		return (byte)result;
	}
	public static void main(String args[]) {
		System.out.println(swap((byte)10));
		System.out.println(swap((byte)1));
		System.out.println(swap((byte)-1));
		
	}

}
