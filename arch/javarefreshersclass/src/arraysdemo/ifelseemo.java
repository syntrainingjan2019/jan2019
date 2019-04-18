package arraysdemo;

public class ifelseemo {
	public static int arithops(int a,int b,char c){
		int retval=0;		
		switch(c){
		case '+':
			retval=a+b;
			break;
		case '-':
			retval=a-b;
			break;
		case '*':
			retval=a*b;
			break;
		case '/':
			retval=a/b;
			break;
	}
		return retval;
	}
	public static double arithops(double a,double b,char c){
		double retval=0;		
		switch(c){
		case '+':
			retval=a+b;
			break;
		case '-':
			retval=a-b;
			break;
		case '*':
			retval=a*b;
			break;
		case '/':
			retval=a/b;
			break;
	}
		return retval;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=10;
		System.out.println(arithops(a,b,'/'));
		System.out.println(arithops(4.5,1.5,'/'));
	}

}
