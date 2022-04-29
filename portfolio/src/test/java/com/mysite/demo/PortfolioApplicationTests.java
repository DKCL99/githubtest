package com.mysite.demo;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.demo.question.QuestionRepository;
import com.mysite.demo.question.QuestionService;

@SpringBootTest
class PortfolioApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private QuestionService questionService;

	@Test
	void contextLoads() {
	}

	@Test
	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("������ �ΰ���?");
//		q1.setContent("������������������");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("������ ��ο�??");
//		q2.setContent("������������");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
//
//		List<Question> searchQuestion = this.questionRepository.findAll();
//		assertEquals(2, searchQuestion.size());
//
//		Question q = searchQuestion.get(0);
//		assertEquals("������ �ΰ���?", q.getSubject());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("������ �ΰ���?", q.getSubject());
//		}
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("���� �׽�Ʈ");
//		q.setContent("�� �ٲ�?");
//		this.questionRepository.save(q);
//		for(int i = 1; i<=200; i++) {
//			String subject = String.format("테스트데이터:[%03d]", i);
//			String content = "없어요";
//			this.questionService.create(subject, content, null);
//		}
	}

}
