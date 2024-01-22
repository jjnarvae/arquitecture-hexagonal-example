package com.product.mgmt.ou.postgres.productrelation.repository;

import com.product.mgmt.ou.postgres.productrelation.entity.ProductRelationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRelationRepository  extends JpaRepository<ProductRelationEntity, Long> {
}
