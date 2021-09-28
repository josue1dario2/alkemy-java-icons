package com.fmalessio.alkemy.icons.repository;

import com.fmalessio.alkemy.icons.entity.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<PaisEntity, Long> {

}
