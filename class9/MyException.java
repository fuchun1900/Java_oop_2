package class9;

public class MyException extends Exception{
	public class MyTest{
		public void foo() {
			try {
				bar();
			}catch (MyException e) {
				}finally {
					baz();
				}
		}
		public void bar() throws MyException{
			throw new MyException();
		}
		public void baz(){
			throw new RuntimeException();
		}
	}

}
