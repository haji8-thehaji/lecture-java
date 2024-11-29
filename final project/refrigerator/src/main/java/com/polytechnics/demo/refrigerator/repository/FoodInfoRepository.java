package com.polytechnics.demo.refrigerator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.model.ref.TestDto;
import com.polytechnics.demo.refrigerator.model.ref.common.FoodInfoDetail;


public interface FoodInfoRepository extends JpaRepository<FoodInfo, Integer> {

    List<FoodInfo> findByFoodCategoryId(int foodCategoryId);


    //@Query("select f.id , fc.name as category_name from food_info as f inner join food_category as fc on f.category_id =:foodCategoryId", nativeQuery = true)
    //List<Object[]> findByFoodInfoByFoodCategoryId(@Param("foodCategoryId") int foodCategoryId );
    @Query(
        value = "SELECT f.*, fc.name as category_name FROM FOOD_INFO f inner join FOOD_CATEGORY as fc on f.food_category_id = fc.id WHERE f.food_category_id =:bno", 
        nativeQuery = true)
    Object[] findAllActiveUsersNative(@Param("bno") int bno);

    @Query(nativeQuery=true, value="SELECT NEW com.polytechnics.demo.refrigerator.model.ref.common.FoodInfoDetail(f.id, f.food_category_id, f.name, f.standard_expire_day, f.standard_price, f.standard_volume, f.storage_type, f.custom_bool, f.season_spring, f.season_summer, f.season_winter, fc.name as category_name ) FROM FOOD_INFO f inner join FOOD_CATEGORY as fc on f.food_category_id = fc.id WHERE f.food_category_id =:bno")
    // @Query(
    //     value = "SELECT f.id, f.food_category_id, f.name, f.standard_expire_day, f.standard_price, f.standard_volume, f.storage_type, f.custom_bool, f.season_spring, f.season_summer, f.season_winter, fc.name as category_name FROM FOOD_INFO f inner join FOOD_CATEGORY as fc on f.food_category_id = fc.id WHERE f.food_category_id =:bno", 
    //     nativeQuery = true)
    List<FoodInfoDetail> findByFoodInfoDetail(@Param("bno") int bno);


    
    // @Query(nativeQuery=true, value= "select new com.polytechnics.demo.refrigerator.model.ref.TestDto(t.id, f.name, t.phone ) from Test2 t left outer join FOOD_INFO f on t.id = f.id ")
    @Query(nativeQuery=true, value= "select t.id, f.name, t.phone  from Test2 t left outer join FOOD_INFO f on t.id = f.id ")
    List<TestDto> findTestDto();

}   