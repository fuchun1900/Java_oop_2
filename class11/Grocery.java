package class11;
import java.lang.ref.*;
import java.util.*;

public class Grocery {
	private static final int SIZE = 10000;
	private double[] d = new double[SIZE];
	private String id;
	public Grocery(String id) {
		this.id = id;
	}
	public String toString() {
		return id;
	}
	public void finalize() {
		System.out.println("Finalizeing " + id);
	}

}
