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
public class Bread {
    @Id
    @Column(name = "breadID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long breadID;
    @Column(name = "brand")
    private String brand;
    @Column(name = "sliced")
    private boolean sliced;
}
