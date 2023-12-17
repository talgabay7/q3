public static IntNode q3_buildList() {
		System.out.println("enter a number ");
		int num=input.nextInt();
		if(num==-1)
			return null;
		IntNode list=new IntNode(num);
		IntNode first=list;
		IntNode p=list;
		System.out.println("enter a number ");
		num=input.nextInt();
		while(num!=-1) {
			p=new IntNode(num);
			list.setNext(p);
			list=p;
			System.out.println("enter a number ");
			num=input.nextInt();
		}
		return first;
	}
