package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	Scanner sc = new Scanner(System.in);
    	List<Goods> gList = new ArrayList<Goods>();
    	
    	while(true) {
    		
    		String input = sc.nextLine();
    		
    		if(input.equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("====================");
    			break;
    		} else {
    			Goods goods = new Goods();
    			String[] iArr = input.split(",");
    			goods.setName(iArr[0]);
    			goods.setPrice(Integer.valueOf(iArr[1]));
    			goods.setCount(Integer.valueOf(iArr[2]));
				gList.add(goods);
    		}
    		
    		
    	}
    	for (int i = 0; i < gList.size(); i++) {
			gList.get(i).showInfo();
		}
    	
    	int sum = 0;
    	for (int i = 0; i < gList.size(); i++) {
			sum += gList.get(i).getCount();
		}
		
		System.out.println("모든 상품의 갯수는 " + sum +"개입니다.");
    	
    	
    	sc.close();
    	
    	
    }

}
