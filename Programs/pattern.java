public class pattern{
    public static void main(String[] args){
		int n= Integer.parseInt(args[0]);
		int arr[][]= new int [n][];
		char a[][] = new char [n][];
	
for(int i=0; i<n; i++){
	arr[i] = new int[i+1];
	a[i] = new char[i+1];
	for(int j=0; j<i+1; j++){
	arr[i][j] = (1+j)%2;
	a[i][j]='*';
	
}		
}
for(int i=0; i<n;i++){
	for(int j=0; j<i+1; j++){
	System.out.print(arr[i][j]);
}
	System.out.println();
}
System.out.println();
for(int i=0; i<n;i++){
	for(int j=0; j<i+1; j++){
	System.out.print(a[i][j]);
}
	System.out.println();
}
}
}