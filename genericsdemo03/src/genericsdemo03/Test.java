package genericsdemo03;

public class Test<T> {
	T obj;
	Test(T obj){
		this.obj=obj;
	}
	public T getObject(){
		return this.obj;
	}
}
