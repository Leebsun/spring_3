package com.iu.board;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	private String name;
	
	public BoardDAO() {
		name="iu";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
