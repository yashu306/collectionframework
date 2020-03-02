package com.klu;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataList<Integer> l = new DataList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        System.out.println( l.get(0) );
        System.out.println( l.get(1) );
        System.out.println(l.size());
	}

}
