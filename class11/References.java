package class11;
import java.lang.ref.*;
import java.util.*;

public class References {
	private static  ReferenceQueue<Grocery> rq = new ReferenceQueue<Grocery>();
	
	public static void checkQueue() { //查看队列
		//从队列中取出一个引用并删除
		Reference<? extends Grocery> inq = rq.poll();
		int i = 0;
		if(inq == null)
			System.out.println("引用队列为空");
		else
			while(inq != null && i++ < 30) {
				System.out.println("引用队列中第"+i+"个引用为： "
						+inq+", 所引用第对象为： "+inq.get());
				inq = rq.poll();
			}
	}
	public static void main(String[] args) {
		final int size = 10;
		//创建10个Grocery对象及10个软引用
		System.out.println("--------测试软引用——--------");
		Set<SoftReference<Grocery>> sa = new HashSet<SoftReference<Grocery>>();
		for(int i = 0; i < size; i++) {
			SoftReference<Grocery> ref =
					new SoftReference<Grocery>(new Grocery("Grocery_soft" + i),rq);
			System.out.println("创建：软引用"+i+",所引用第对象为："+ref.get());
			sa.add(ref);
		}
		System.gc();
		checkQueue();
		//创建10个Grocery对象及10个弱引用
		System.out.println("--------测试弱引用——--------");
		Set<WeakReference<Grocery>> wa = new HashSet<WeakReference<Grocery>>();
		for(int i = 0; i < size; i++) {
			WeakReference<Grocery> ref =
					new WeakReference<Grocery>(new Grocery("Grocery_Weak" + i),rq);
			System.out.println("创建：弱引用"+i+",所引用第对象为："+ref.get());
			wa.add(ref);
		}
		System.gc();
		checkQueue();
		//创建10个Grocery对象及10个虚引用
		System.out.println("--------测试虚引用——--------");
		Set<PhantomReference<Grocery>> pa = new HashSet<PhantomReference<Grocery>>();
		for(int i = 0; i < size; i++) {
			PhantomReference<Grocery> ref =
					new PhantomReference<Grocery>(new Grocery("Grocery_Phantom" + i),rq);
			System.out.println("创建：虚引用"+i+",所引用第对象为："+ref.get());
			pa.add(ref);
		}
		System.gc();
		checkQueue();
		
	}
	

}
