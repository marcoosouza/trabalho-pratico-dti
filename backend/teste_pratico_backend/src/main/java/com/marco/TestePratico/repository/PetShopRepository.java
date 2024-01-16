package com.marco.TestePratico.repository;

import com.marco.TestePratico.model.PetShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PetShopRepository extends JpaRepository<PetShop, Long> {
}
