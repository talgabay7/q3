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
	public static IntNode q6_deleteNum(IntNode p,int num) {
		if(p.getValue()==num) {
			p=p.getNext();
			return p;
		}
		IntNode list=p.getNext();
		IntNode first=p;
		while(list!=null) {
			if(list.getValue()==num) {
				p.setNext(p.getNext().getNext());
			}
			p=p.getNext();
			list=list.getNext();
		}
		return first;
	}
	public static void main(String[] args) {
		System.out.println(q3_buildList());
	}

}
