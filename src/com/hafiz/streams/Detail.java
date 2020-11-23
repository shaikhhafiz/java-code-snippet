package com.hafiz.streams;

import java.math.BigDecimal;

public class Detail {
  private boolean isDeduction;
  private BigDecimal amount;

  public boolean isDeduction() {
    return isDeduction;
  }

  public void setDeduction(boolean deduction) {
    isDeduction = deduction;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
}
