package com.project.bootcamp.mapper;

import com.project.bootcamp.model.Stock;
import com.project.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto){
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }

    public StockDTO toDto(Stock stock) {
        StockDTO dto = new StockDTO();
        dto.setId(dto.getId());
        dto.setName(dto.getName());
        dto.setPrice(dto.getPrice());
        dto.setVariation(dto.getVariation());
        dto.setDate(dto.getDate());
        return dto;
    }
}
