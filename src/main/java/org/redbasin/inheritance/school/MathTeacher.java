package org.redbasin.inheritance.school;

public class MathTeacher extends Teacher {
  public String mathSubject;

  public void printInfo() {
    System.out.println("school = " + school);
    System.out.println("subject = " + subject);
    System.out.println("mathSubject = " + mathSubject);
  }
}