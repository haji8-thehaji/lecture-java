package com.haji.demo.mysql_test.model;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="board")
public class Board {
    
    /** 아이디 */
	@Id
    private String id;
    /** 이름 */
    private String name;
    private String title;
    private String contents;
    @Temporal(TemporalType.TIMESTAMP) // 날짜 형식 설정
    private Date created_dt;
    private int view;
}