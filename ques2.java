package ashishbhatia;

public class ques2 {
private int a;
private int b;

public ques2() {

}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public static void main(String[] args) {
	ques2 obj= new ques2();
	obj.setA(5);
	obj.setB(6);
	System.out.println(obj.getA());
}
}
