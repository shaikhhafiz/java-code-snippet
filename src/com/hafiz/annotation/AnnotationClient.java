package com.hafiz.annotation;

import java.lang.reflect.Field;

public class AnnotationClient {
  public static void main(String args[]) {
    nullValidator();
  }

  private static void nullValidator() {
    Class annotatedClass = User.class;
    Field[] fields = annotatedClass.getDeclaredFields();
    for(Field field : fields) {
      if(field.isAnnotationPresent(NotNull.class)){
        NotNull notNull = field.getAnnotation(NotNull.class);
        if(notNull.type().equals("create")){
          try {
            throw new Exception(field.getName() + " field of " + notNull.getClass() + " contains null value");
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
