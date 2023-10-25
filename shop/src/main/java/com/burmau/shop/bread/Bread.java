package com.burmau.shop.bread;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "Bread")
class Bread {
    @Id
    @Column(name = "breadID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long breadID;
    @Column(name = "brand")
    String brand;
    @Column(name = "sliced")
    boolean sliced;
}
