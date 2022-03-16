package linkedlistvsarraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

	public static void main(String[] args) {
		//slower to get an element, add and remove element way faster,
		LinkedList<String> namesLinkedList = new LinkedList<String>();
		namesLinkedList.add("Sokoeurn");
		namesLinkedList.add("Sarom");
		System.out.println(  namesLinkedList.get(1));
		namesLinkedList.add(0, "lida");
		System.out.println(namesLinkedList.get(0));
		System.out.println(namesLinkedList.size());
		
		System.out.println("******************************");
		
		ArrayList<String> namesArrayList = new ArrayList<String>();
		namesArrayList.add("kosal");
		namesArrayList.add("Kout");
		System.out.println( namesArrayList.get(1));	//random access,
		namesArrayList.add(0, "koev");
		System.out.println(namesArrayList.get(0));
		System.out.println(namesArrayList.size());
	}

}
