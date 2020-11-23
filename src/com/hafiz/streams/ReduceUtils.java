package com.hafiz.streams;

import java.math.BigDecimal;
import java.util.List;

public class ReduceUtils {
  BigDecimal reduce(List<Detail> list) {
    return list.stream()
        .map(el -> el.isDeduction() ? el.getAmount().multiply(BigDecimal.valueOf(-1)) : el.getAmount())
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
