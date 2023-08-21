package com.burmau.shop.repository.fruit;

import com.burmau.shop.model.fruit.Pepper;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


public interface PepperRepository extends CrudRepository<Pepper, Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Pepper(price, description) VALUES (:price, :description)", nativeQuery = true )
    void saveNewPepper(@Param("price") BigDecimal price, @Param("description")String description);
}
