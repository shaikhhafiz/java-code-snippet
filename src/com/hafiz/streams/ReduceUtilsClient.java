package com.hafiz.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReduceUtilsClient {
  public static void main(String[] args) {
    ReduceUtils utils = new ReduceUtils();
    List<Detail> list = new ArrayList<>();
    Detail detail1 = new Detail();
    detail1.setAmount(BigDecimal.TEN);
    detail1.setDeduction(false);
    list.add(detail1);

    Detail detail2 = new Detail();
    detail2.setAmount(BigDecimal.ONE);
    detail2.setDeduction(true);
    list.add(detail2);

    System.out.println(utils.reduce(list));
  }
}
