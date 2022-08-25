class fibonacci{
	public static void main(String args[]){
	int num = Integer.parseInt(args[0]), a=0, b=1;
	int sum =0;

System.out.print(a+" ");
System.out.print(b+" ");
	for(int i=0; i<num-2; i++){
	sum=a+b;
	System.out.print(sum+" ");
	a=b;
	b=sum;
		}
	}
}