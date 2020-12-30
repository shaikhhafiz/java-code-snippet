package com.hafiz.calender;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;

public class CalenderUtils {

  public static void main(String args[]) {
    test();
  }

  public static void test() {
    Calendar calendar = Calendar.getInstance();
    Instant instant = calendar.toInstant();
    System.out.println(instant);
    String instantStr = "2020-12-30T09:56:21.799+06:00[Asia/Dhaka]";
    System.out.println(instant.atZone(ZoneId.systemDefault()));
  }
}
