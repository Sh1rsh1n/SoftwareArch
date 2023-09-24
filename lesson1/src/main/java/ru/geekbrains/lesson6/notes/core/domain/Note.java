package ru.geekbrains.lesson6.notes.core.domain;

import java.util.Date;
import java.util.Objects;

public class Note {

    @Override
    public boolean equals(Object o) {
        Note note = (Note) o;
        return id == note.id;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (editDate != null ? editDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    //region Constructors

    public Note(int id, int userId, String title, String details) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.details = details;
        this.creationDate = new Date();
    }

    //endregion

    //region Public Getters And Setters (Properties)

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    //endregion

    //region Private Fields

    private int id;
    private int userId;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;

    //endregion

}
