package com.example.repository;

import com.example.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FruitRepository  extends JpaRepository<Fruit, Long> {
}
