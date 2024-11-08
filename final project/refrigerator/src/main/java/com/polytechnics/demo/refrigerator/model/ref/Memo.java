package com.polytechnics.demo.refrigerator.model.ref;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="MEMO")
public class Memo {
    
	@Id
	@Column(name="id")
	private int id;
	private String memo;
    private Date createdDt;
    private Date deletedDt;
}