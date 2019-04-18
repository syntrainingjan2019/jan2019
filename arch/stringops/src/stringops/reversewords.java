package stringops;

public class reversewords {
	public static String reverseWord(String str){
		String words[]=str.split(" ");
		String reverseWord="";
		for(String w:words){
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseWord+=sb.toString()+" ";
		}
		return reverseWord;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWord("my name is bob"));
	}

}
