package ru.geekbrains.lesson6.database;

import ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.*;

public class NotesTable {

    private Random random = new Random();

    private List<NotesRecord> records;

    public NotesTable() {
        if (records == null) {
            records = new ArrayList<>();
            int recordsCount = 5 + random.nextInt(10);
            for (int i = 0; i < recordsCount; i++) {
                records.add(new NotesRecord("title #" + i, "details #" + i));
            }
        }
    }

    public List<NotesRecord> getRecords() {
        return records;
    }

}
