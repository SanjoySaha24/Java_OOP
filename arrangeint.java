import java.util.*;
public class arrangeint{
	static void Swap(int[] arr, int i, int j){
	int temp =  arr[i];
	arr[i]= arr[j];
	 arr[j] = temp;
}
	public static void main(String[] args){
	int n =args.length;
	int [] arr= new int [n];
	for(int i=0; i<n; i++){
	arr[i] = Integer.parseInt(args[i]);
}
	for(int i=0;i<n;i++){	
	for(int j=i;j<n;j++){
	if(arr[i] > arr[j]){
	Swap(arr, i ,j);
}
}
}
System.out.println(Arrays.toString(arr));
}
}
	