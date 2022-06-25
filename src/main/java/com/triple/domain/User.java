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
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userCode;
	
	@NotNull
	@Column
	private UUID userId;

	@Builder
	public User(Long userCode, @NotNull UUID userId) {
		super();
		this.userCode = userCode;
		this.userId = userId;
	}
	
	
}
