import java.util.*;
class palin{
	public static void main(String[] args){
	String s = args[0]; 
	int lastindex =s.length()-1;
	boolean flag=true;

	for(int i=0; i<(s.length())/2-1; i++){
	if(s.charAt(i) != s.charAt(lastindex)){
	lastindex--;
	flag=false;
	break;
}
}
	
	if(flag){
	System.out.println("Palindrome");
}
else{
System.out.println("Not Palindrome");
}
}
}