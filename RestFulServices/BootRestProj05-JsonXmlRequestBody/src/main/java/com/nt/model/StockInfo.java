package com.nt.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockInfo {
private Integer stockId;
private String stockName;
private String company;
private Double stockPrice;
private String stockType;
private LocalDateTime stockBuyTime;
}
