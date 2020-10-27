package edu.cnm.deepdive.studentcontact.model.entity;

import androidx.room.Entity;

@Entity
public class Contact {

  private long id;

  private String lastName;

  private String firstName;

  private String middleName;

  private String phoneNumber;

  private String smsNumber;

  private String email;

}
