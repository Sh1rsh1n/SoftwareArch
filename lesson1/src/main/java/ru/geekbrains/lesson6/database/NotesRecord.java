package ru.geekbrains.lesson6.database;

import java.util.Date;
import java.util.Objects;

public class NotesRecord {

    private static int counter = 1000;

    {
        id = ++counter;
    }

    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
        creationDate = new Date();
    }

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

    private int id;
    private int userId;

    private String title;

    private String details;

    private Date creationDate;
    private Date editDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotesRecord that = (NotesRecord) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(details, that.details)) return false;
        if (!Objects.equals(creationDate, that.creationDate)) return false;
        return Objects.equals(editDate, that.editDate);
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
}
