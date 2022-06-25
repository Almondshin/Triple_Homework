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
public class Place {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long placeCode;
	
	@NotNull
	@Column
	private UUID placeId;

	@Builder
	public Place(Long placeCode, @NotNull UUID placeId) {
		super();
		this.placeCode = placeCode;
		this.placeId = placeId;
	}
	
}
