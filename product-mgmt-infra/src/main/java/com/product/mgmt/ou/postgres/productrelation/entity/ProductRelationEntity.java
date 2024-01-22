package com.product.mgmt.ou.postgres.productrelation.entity;


import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "product", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ProductRelationEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String code;
    private String name;


}
