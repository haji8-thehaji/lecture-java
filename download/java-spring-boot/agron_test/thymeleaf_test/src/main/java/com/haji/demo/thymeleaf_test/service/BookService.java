package com.haji.demo.thymeleaf_test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haji.demo.thymeleaf_test.model.Book;

@Service
public class BookService {
	
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("1001", "장기20세기", "조반니 아리기"));
		books.add(new Book("1002", "신의 지문", "그레이엄 핸콕"));
		books.add(new Book("1003", "신화의 이미지", "조지프 캠벨"));
		books.add(new Book("1004", "블랙아테나 1", "마틴 버낼"));
		books.add(new Book("1005", "판다의 엄지", "스티븐 제이 굴드"));
		books.add(new Book("1006", "이기적 유전자", "리처드 도킨스"));
		
		return books;
	}
}