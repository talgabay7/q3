import java.util.*;
public class Main {
	public static Scanner input=new Scanner(System.in);
	public static IntNode q3_buildList() {
		IntNode list=new IntNode(-1);
		IntNode first=list;
		IntNode p;
		System.out.println("enter a number ");
		int num=input.nextInt();
		while(num!=-1) {
			p=new IntNode(num);
			list.setNext(p);
			list=p;
			System.out.println("enter a number ");
			num=input.nextInt();
		}
		return first.getNext();
	}
	public static void main(String[] args) {
		System.out.println(q3_buildList());
	}

}
