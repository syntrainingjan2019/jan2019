package genericsdemo;

public class Test<T> {
	T obj;
	Test(T obj){
		this.obj=obj;
	}
	public T getOject(){
		return this.obj;
	}
}
