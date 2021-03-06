package com.mysite.demo.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.mysite.demo.answer.Answer;
import com.mysite.demo.user.SiteUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="question")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 200)
	private String subject;
	@Column(columnDefinition = "TEXT")
	private String content;
	private LocalDateTime createDate;
	@OneToMany(mappedBy="question",cascade = CascadeType.REMOVE)
	private List<Answer> answerList;
	@ManyToOne
	private SiteUser author;

	private LocalDateTime modifyDate;
	@ManyToMany
	Set<SiteUser> voter;
}
