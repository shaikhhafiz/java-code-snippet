package com.hafiz.annotation;

public class User {

  @NotNull(type = "update")
  private String firstName;
  private String lastName;
}
