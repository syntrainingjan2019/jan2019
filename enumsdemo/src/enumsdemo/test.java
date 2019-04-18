package enumsdemo;

public class test {
	public static int diff(int[] a){
		int diff=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				diff=Integer.max(diff, a[j]-a[i]);
			}
		}
		return diff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
