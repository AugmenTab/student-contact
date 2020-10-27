package edu.cnm.deepdive.studentcontact.model.entity;

import androidx.room.Entity;

@Entity
public class StudentContact {

  private long id;

  private long studentId;

  private long contactId;

  private boolean primary;

  private Relationship relationship;

  public enum Relationship {
    PARENT, GUARDIAN, SIBLING, OTHER;
  }

}
