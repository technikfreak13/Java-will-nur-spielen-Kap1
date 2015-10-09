
public class Uebung {
	
	static long fibonacci(long i){
		if(i<=0){return 0;}
			else {
				if(i==1 || i==2){return 1;}
						else{return(fibonacci(i-2)+fibonacci(i-1));} 
			}
	}



	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(fibonacci(10));
	}
	}
	


		
		

		
	

	


