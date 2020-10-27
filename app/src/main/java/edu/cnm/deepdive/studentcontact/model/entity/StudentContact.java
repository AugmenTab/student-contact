package edu.cnm.deepdive.studentcontact.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@SuppressWarnings("NotNullFieldNotInitialized")
@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Student.class,
            parentColumns = "id",
            childColumns = "studentId"
        ),
        @ForeignKey(
            entity = Contact.class,
            parentColumns = "id",
            childColumns = "contactId"
        )
    },
    indices = {
        @Index(value = "relationship", unique = true), // Should this be removed like in Student?
        @Index(value = {"student_id", "contact_id"}, unique = true)
    }
)
public class StudentContact {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "student_contact_id")
  private long id;

  @ColumnInfo(name = "student_id")
  private long studentId;

  @ColumnInfo(name = "contact_id")
  private long contactId;

  private boolean primary;

  @NonNull
  @ColumnInfo(name = "relationship_type")
  private Relationship relationship;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }

  public long getContactId() {
    return contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public boolean isPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  @NonNull
  public Relationship getRelationship() {
    return relationship;
  }

  public void setRelationship(
      @NonNull Relationship relationship) {
    this.relationship = relationship;
  }

  public enum Relationship {
    PARENT, GUARDIAN, SIBLING, OTHER;
  }

}
