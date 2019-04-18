package enumsdemo03;

public class ColorsDemo {
	enum colors{
		red(1),
		green(2),
		blue(3);
		private int value;
		colors(int value){
			this.value=value;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(colors s:colors.values()){
			System.out.println(s+" value : "+s.value);
		}
	}

}
