package com.iu.board;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
@Service
public class BoardService {
	private int age;
	
	@Inject
	private BoardDAO boardDAO;
	
	
	public BoardService() {
		age=25;
	}
	
	
	
	public BoardDAO getBoardDAO() {
		return boardDAO;
	}



	public void prn(){
		System.out.println(boardDAO.getName());
		System.out.println(this.age);
	}
	
	public static void main(String[] args) {
		BoardService boardService= new BoardService();
		boardService.prn();
	}
	

}
