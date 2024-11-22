package com.polytechnics.demo.refrigerator.model.ref;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CART")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter
    @Setter
    private Integer food_id;
    private String volume;
    private Integer count;
    private Integer money;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getVolume() { return volume; }
    public void setVolume(String volume) { this.volume = volume; }

    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }

    public Integer getMoney() { return money; }
    public void setMoney(Integer money) { this.money = money; }
}
