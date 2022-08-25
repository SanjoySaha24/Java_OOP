class Rectangle{
	int p,a,b;
	Rectangle(int a,int b){
	this.a=a;
	this.b=b;	
}
	void print1(){
	p=2*(a+b);
	System.out.println("Perimeter of a rectangle is : "+p);	
}
}
	class Circle{
	double p,a,b;
	Circle(int a){
	this.a=a;
	}	
	void print2(){
p=2*3.14*a;
System.out.println("Perimeter of a circle is : "+p);
}
}
class Square{
	int p,a,b;
	Square(int a){
	this.a=a;
	}	
	void print3(){
p=4*a;
System.out.println("Perimeter of square is : "+p);
}
}
class FindPeri{
	public static void main(String args[]){
	int l=args.length;
	int i=0;
	int x,y;
	while(l!=i){
	if(args[i].equalsIgnoreCase("Rectangle")){
	x=Integer.parseInt(args[i+1]);	
	y=Integer.parseInt(args[i+2]);
	i=i+3;
	Rectangle rec = new Rectangle(x,y);
	rec.print1();	
}
else if(args[i].equalsIgnoreCase("Circle")){
	x=Integer.parseInt(args[i+1]);
	i=i+2;
	Circle c = new Circle(x);
	c.print2();
}
else if(args[i].equalsIgnoreCase("Square")){
	x=Integer.parseInt(args[i+1]);
	i=i+2;
	Square s = new Square(x);
	s.print3();
}
}
}
}

