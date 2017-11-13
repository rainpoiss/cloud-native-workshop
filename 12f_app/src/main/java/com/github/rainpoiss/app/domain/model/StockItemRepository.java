package com.github.rainpoiss.app.domain.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by 38812036016 on 13.11.2017.
 */
public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}

