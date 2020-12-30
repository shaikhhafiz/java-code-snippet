package com.hafiz.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class OldVsNewDate {

  public static void main(String args[]) {
    numberOfDaysInMonth();
  }

  public static void numberOfDaysInMonth() {
    // Old
    Calendar calendar = new GregorianCalendar(1990, Calendar.FEBRUARY, 20);
    int oldDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    System.out.println(oldDaysInMonth);

    // New
    int newDaysInMonth = YearMonth.of(1990, 2).lengthOfMonth();
    System.out.println(newDaysInMonth);
  }

  public static void formatTimeAndParse() {
    // Old
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date oldNow = new Date();
    String oldFormattedDate = dateFormat.format(oldNow);
    Date oldParsedDate = null;
    try {
      oldParsedDate = dateFormat.parse(oldFormattedDate);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(oldParsedDate);

    // New
    LocalDate newNow = LocalDate.now();
    DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String newFormattedDate = newNow.format(newFormatter);
    LocalDate newParsedDate = LocalDate.parse(newFormattedDate, newFormatter);

    System.out.println(newParsedDate);
  }

  public static void timeSpanBetweenTwoTime() {
    // Old
    GregorianCalendar calendar = new GregorianCalendar();
    Date oldNow = new Date();
    calendar.add(Calendar.HOUR, 1);
    Date oldHourLater = calendar.getTime();
    long elapsed = oldHourLater.getTime() - oldNow.getTime();
    System.out.println(elapsed);

    // New
    LocalDateTime newNow = LocalDateTime.now();
    LocalDateTime newHourLater = LocalDateTime.now().plusHours(1);
    Duration span = Duration.between(newNow, newHourLater);
    System.out.println(span);
  }

  public static void convertTimeZone() {
    // Old
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTimeZone(TimeZone.getTimeZone("CET"));
    Date oldCentralEastern = calendar.getTime();
    System.out.println(oldCentralEastern);

    // New
    ZonedDateTime newCentralEastern = LocalDateTime.now().atZone(ZoneId.of("CET"));
    System.out.println(newCentralEastern);
  }

  public static void truncate() {
    // Old
    Calendar now = Calendar.getInstance();
    now.set(Calendar.MINUTE, 0);
    now.set(Calendar.SECOND, 0);
    now.set(Calendar.MILLISECOND, 0);
    Date oldTruncated = now.getTime();
    System.out.println(oldTruncated);

    // New
    LocalTime newTruncated = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
    System.out.println(newTruncated);
  }

  public static void alterSpecificFields() {
    // Old
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.set(Calendar.MONTH, Calendar.JUNE);
    Date oldInJune = calendar.getTime();
    System.out.println(oldInJune);

    // New
    LocalDateTime newInJune = LocalDateTime.now().withMonth(Month.JUNE.getValue());
    System.out.println(newInJune);
  }

  public static void addingSubtractingTime() {
    // Old
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.add(Calendar.HOUR_OF_DAY, -5);
    Date oldFiveHoursBefore = calendar.getTime();
    System.out.println(oldFiveHoursBefore);

    // New
    LocalDateTime newFiveHoursBefore = LocalDateTime.now().minusHours(5);
    System.out.println(newFiveHoursBefore);
  }

  public static void extractSpecificFields() {
    // Old
    int oldMonth = new GregorianCalendar().get(Calendar.MONTH);
    System.out.println(oldMonth);

    // New
    Month newMonth = LocalDateTime.now().getMonth();
    System.out.println(newMonth);
  }

  public static void specificTime() {
    // Old
    Date oldBirthDay = new GregorianCalendar(1990, Calendar.DECEMBER, 15).getTime();
    System.out.println(oldBirthDay);

    // New
    //It will not show expected month if we use Calendar.DECEMBER instead Month.DECEMBER
    LocalDate newBirthDay = LocalDate.of(1990, Month.DECEMBER, 15);
    System.out.println(newBirthDay);
  }

  public static void currentTime() {
    // Old
    Date oldNow = new Date();
    System.out.println(oldNow);

    // New
    ZonedDateTime newNow = ZonedDateTime.now();
    System.out.println(newNow);
  }

}
