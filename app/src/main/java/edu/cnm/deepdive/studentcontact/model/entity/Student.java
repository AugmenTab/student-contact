package edu.cnm.deepdive.studentcontact.model.entity;

import androidx.room.Entity;
import java.time.LocalDate;

@Entity
public class Student {

  private long id;

  private String lastName;

  private String firstName;

  private String middleName;

  private LocalDate enrolled;

  private LocalDate disenrolled;

}
