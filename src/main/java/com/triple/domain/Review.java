package com.triple.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewCode;
	
	@NotNull
	@Column
	private UUID reivewId;
	
	@NotNull
	@Column
	private String type;
	
	@NotNull
	@Column
	private String action;
	
	@Column
	private String content;

	@Builder
	public Review(Long reviewCode, @NotNull UUID reivewId, @NotNull String type, @NotNull String action,
			String content) {
		super();
		this.reviewCode = reviewCode;
		this.reivewId = reivewId;
		this.type = type;
		this.action = action;
		this.content = content;
	}

	
	
	
	
}
