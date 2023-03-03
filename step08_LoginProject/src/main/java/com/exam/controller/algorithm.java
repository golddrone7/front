package com.exam.controller;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class algorithm {
	public static void main(String[] args) {
		Consumer<String> conn = (x) -> {
			System.out.println(x + "님 안녕하세요");
		};
		
		Consumer<String> conn2 = x -> System.out.println(x + "님 반갑습니다.");
			
		conn.accept("자바");
		conn2.accept("JSP");
		
		Supplier<Integer> conn3 = ()-> 3;
		Supplier<String> conn4 = () -> {
			System.out.println("@@@");
			return "안녕하세요!!!";
		};
		
		
		System.out.println(conn3.get());
		System.out.println(conn4.get());
	
		
		
		
		
	}
	
	public static void good(Supplier<String> t) {
		System.out.println(t.get());
	}

}
