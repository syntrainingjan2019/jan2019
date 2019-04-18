package stringops;

public class sortcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="efghsa";
		
		char temp=0;
		char[] chars=original.toCharArray();
		for(int i=0;i<chars.length;i++){
			for(int j=0;j<chars.length;j++){
				System.out.println("comparing "+chars[j]+ " > "+chars[i]);
				if(chars[j]>chars[i]){
					System.out.println("swapping values for chars[j]"+chars[j]+ " chars[i]"+chars[i]);
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
					System.out.println("swapped values for chars[j]"+chars[j]+ " chars[i]"+chars[i]);
				}
			}
		}
		for(int k=0;k<chars.length;k++){
			System.out.print(chars[k]);
		}
	}

}
