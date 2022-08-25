class primerange{
	public static void main(String args[]){
	int lower = Integer.parseInt(args[0]), count =0, upper= Integer.parseInt(args[1]);
	int i;
	for(i= lower; i<= upper; i++){
		for(int j= 1; j<= i; j++){
			if(i%j == 0)
			count++;
			}
		}
	if(count==2){
	System.out.print(i + " ");
	}
	count =0;
	}
}
