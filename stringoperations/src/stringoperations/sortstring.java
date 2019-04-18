package stringoperations;

public class sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="efghsa";
		char temp=' ';
		char[] chars=original.toCharArray();
		for(int i=1;i<chars.length;i++){
			for(int j=0;j<chars.length;j++){
				if(chars[j]>chars[i]){
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
				}
			}			
			for(char a:chars){
				System.out.print(a+"\t");
			}
			System.out.println();
		}
		for(char a:chars){
			System.out.print(a);
		}
	}

}
