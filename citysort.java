import java.util.*;
class citysort{
	static void Swap(String[] arr, int i, int j){
	String temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
	public static void main(String args[]){
	int n = args.length;
	for(int i=0; i<n; i++){
	for(int j=i; j<n; j++){
	
	if(args[i].compareTo(args[j])>0){
		Swap(args,i,j);
}
}
}
System.out.println(Arrays.toString(args));
}
}