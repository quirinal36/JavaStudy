package www.jcoding.kr.minigold649;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Listt {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("hello");
		ls.add("hi");
		ls.add("nice");
		
		for (int i = 0 ; i < ls.size() ; i++) {
			System.out.println(i + " : " + ls.get(i));
		}

		System.out.println();
		
		ls.add(2, "ho~~");
		for (int i = 0 ; i < ls.size() ; i++) {
			System.out.println(i + " : " + ls.get(i));
		}
		
		System.out.println();
		
		ls.remove(0);
		
		for (int i = 0 ; i < ls.size() ; i++) {
			System.out.println(i + " : " + ls.get(i));
		}
		
		System.out.println();
		
		List<Integer> is = new ArrayList<Integer>();
		is.add(300);
		is.add(3500);
		
		for (int i = 0 ; i < is.size() ; i++) {
			System.out.println(is.get(i).toString());	
		}
		
		System.out.println();
		
		Boo b1 = new Boo();
		b1.he = "haha";
		b1.sansage = 153983;
		b1.sansb = "papirusu";
		b1.wa = "wa sansu";
		b1.wow = new Date();
		
		Boo b2 = new Boo();
		b2.he = "ha?";
		b2.sansage = 10;
		b2.sansb = "pa?";
		b2.wa = "wa san";
		b2.wow = new Date();
		
		List<Boo> boom = new ArrayList<Boo>();
		boom.add(b1);
		boom.add(b2);
		
		for (int i = 0 ; i < boom.size() ; i++) {
			Boo currentItem = boom.get(i);
			System.out.println("he : " + currentItem.he);
			System.out.println("sansage : " + currentItem.sansage);
			System.out.println("wa : " + currentItem.wa);
			System.out.println("sansb : " + currentItem.sansb);
			System.out.println("wow : " + new SimpleDateFormat("y-MM-dd hh:mm:s").format(currentItem.wow));
			System.out.println();
		}
	}

}
