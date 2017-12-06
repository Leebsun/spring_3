package com.iu.s3;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iu.board.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class BoardServiceTest {
	
	@Inject
	BoardService boardService;

	@Test
	public void test() {
		System.out.println("BoardService Test");
		assertNotNull(boardService);
	}

}
