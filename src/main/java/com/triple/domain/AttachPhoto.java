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
public class AttachPhoto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long attachPhotoCode;
	
	@NotNull
	@Column
	private UUID attachPhotoId;

	@Builder
	public AttachPhoto(Long attachPhotoCode, @NotNull UUID attachPhotoId) {
		super();
		this.attachPhotoCode = attachPhotoCode;
		this.attachPhotoId = attachPhotoId;
	}


	
	
}
