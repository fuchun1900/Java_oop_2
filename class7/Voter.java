package class7;

import java.util.Set;
import java.util.HashSet;

public class Voter {
	private static final int MAX_COUNT = 100; //静态变量，最大投票数
	private static int count; //静态变量，投票数
	private static Set<Voter>voters = new HashSet<Voter>(); //静态变量，存放所有已投票的选民
	private String name; //实例变量，投票人姓名
	
	public Voter(String name) {
		this.name = name;
	}
	/**投票*/
	public void voteFor() {
		if (count == MAX_COUNT) {
			System.out.println("投票活动已经结束");
			return;
		}
		if(voters.contains(this)) {
			System.out.println(name + "你不允许重复投票");
		}
		else {
			count++;
			voters.add(this);
			System.out.println("感谢你的投票");
		}
	}
	/**打印投票结果*/
	public static void printVoteResult() {
		System.out.println("当前投票数："+ count);
		System.out.println("参与投票的选民名单如下:");
		for(Voter voter:voters) {
			System.out.println(voter.name);
		}
	}
	public static void main(String args[]) {
		Voter tom = new Voter("tom");
		Voter mike = new Voter("mike");
		Voter jack = new Voter("jack");
		
		tom.voteFor();
		mike.voteFor();
		jack.voteFor();
		printVoteResult();
	}
}
