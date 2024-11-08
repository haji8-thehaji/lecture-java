package com.haji.demo.thymeleaf_test.model.Isagaroot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
    
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="isaga")
public class Isaga  
{
    //private static final long serialVersionUID = 1753729060514530707L;
    /** 아이디 */
	@Id
    @Getter
    @Setter
    private String id;
    /** 이름 */
    @Getter
    @Setter
    private String name;

    
}