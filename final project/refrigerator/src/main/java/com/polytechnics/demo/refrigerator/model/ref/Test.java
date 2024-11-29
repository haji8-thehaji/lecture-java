package com.polytechnics.demo.refrigerator.model.ref;

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
@Table(name = "TEST2")
public class Test {
    @Id
    private String id;
    private String phone;
}