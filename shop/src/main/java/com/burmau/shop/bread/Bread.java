package com.burmau.shop.bread;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Bread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long breadID;
    String brand;
    boolean isSliced;
}
