package com.polytechnics.demo.refrigerator.model.ref.common;

import java.time.Instant;
import java.util.Date;

import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public interface Food {

    String getId();

    String getName();

}