package com.haji.demo.thymeleaf_test.model.haji;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="boardHaji")
public class BoardHaji{ 

    /** 아이디 */
	@Id
    @Getter
    @Setter
    private String id;
    /** 이름 */
    @Getter
    @Setter
    private String name;
	// public BoardHaji() {}
	// public BoardHaji(String id, String name) {
    //     this.id = id;
    //     this.name = name;
    // }
}