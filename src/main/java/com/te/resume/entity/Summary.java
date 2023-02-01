package com.te.resume.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Component
@Entity
public class Summary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer summaryId;
	@ElementCollection
	private List<String> summaryDetails;
	
}
