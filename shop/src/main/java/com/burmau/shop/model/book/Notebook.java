package com.burmau.shop.model.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter @Setter
@ToString
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Notebook extends AbstractBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteBookID;
    private static final BigDecimal BASE_PRICE = new BigDecimal(".1").setScale(2, RoundingMode.HALF_UP);

    private BigDecimal noteBookPrice = BASE_PRICE;
    private int pageCount;
    private final String TYPE = "Notebook";

    Notebook(int pageCount){
        this.setPageCount(pageCount);
    }
    void setPageCount(int pageCount){
        this.pageCount = pageCount;
        this.noteBookPrice = getNoteBookPrice(pageCount);
    }
    BigDecimal getNoteBookPrice(int pageCount){
        return BASE_PRICE.multiply(BigDecimal.valueOf(pageCount).setScale(2, RoundingMode.HALF_UP));
    }
    @Override
    String type() {
        return TYPE;
    }


}
