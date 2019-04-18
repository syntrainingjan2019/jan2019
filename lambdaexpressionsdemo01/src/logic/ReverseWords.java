package logic;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="i love java very much";
		String reverse="";
		String[] words=s1.split(" ");
		for(int i=words.length-1;i>=0;i--){
//			System.out.print(words[i]);
			reverse=reverse+words[i]+" ";
		}
		System.out.println(reverse);
	}

}
