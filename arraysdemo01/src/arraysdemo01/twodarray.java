package arraysdemo01;

public class twodarray {
	public static void disparr(char box[][],int dim){
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				System.out.print(box[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dim=8;
		char box[][]=new char[dim][dim];
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){				
				if(i==0 || j==0 || i==(dim-1) || j==(dim-1)){
					box[i][j]='*';
				}
			}
		}
		for(int i=2;i<5;i++){
			for(int j=2;j<5;j++){			
				if(i==2 || j==2 || i==5 || j==5){
					box[i][j]='*';
				}
					
				
			}
		}
		disparr(box,dim);
	}

}
