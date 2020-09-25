package com.hafiz.date;

import java.text.ParseException;
import java.time.ZoneId;
import java.util.Date;

public class DateUtilsClient {

  public static void main(String[] args) throws ParseException {
    DateUtils du = new DateUtils();
    String dateString = "2018-12-16T00:05:28+0100";
    Date parsedDate = du.convertStringToDate(dateString);
    System.out.println(parsedDate.toInstant().atZone(ZoneId.systemDefault()));
  }
}
