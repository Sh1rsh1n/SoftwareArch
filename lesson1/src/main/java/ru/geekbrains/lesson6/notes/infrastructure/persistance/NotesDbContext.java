package ru.geekbrains.lesson6.notes.infrastructure.persistance;

import ru.geekbrains.lesson6.database.NotesDatabase;
import ru.geekbrains.lesson6.database.NotesRecord;
import ru.geekbrains.lesson6.notes.core.application.interfaces.NotesDatabaseContext;
import ru.geekbrains.lesson6.notes.core.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.configurations.NoteConfiguration;

import java.util.ArrayList;
import java.util.List;

public class NotesDbContext extends DbContext implements NotesDatabaseContext {

    private List<Note> notesList = new ArrayList<>();

    @Override
    public List<Note> getAll() {
        // проверка чтобы каждый раз не добавлять все элементы в таблицу
        if (notesList.isEmpty()) {
            //TODO: Этого кастинга быть не должно, тут должен работать внутренний механизм фреймворка
            for (NotesRecord record : getNoteRecords()) {
                notesList.add(new Note(
                        record.getId(),
                        record.getUserId(),
                        record.getTitle(),
                        record.getDetails()
                ));
            }
        }
        return notesList;
    }

    public NotesDbContext(Database database) {
        super(database);
    }

    @Override
    public boolean saveChanges() {

        // сохранение добавленного элемента в таблицу
        if (notesList.size() > getNoteRecords().size()) {
            Note note = notesList.get(notesList.size() - 1);
            getNoteRecords().add(new NotesRecord(
                    note.getTitle(), note.getDetails()
            ));
            return true;
        }

        // сохранение после удаления элемента в таблице
        if (notesList.size() < getNoteRecords().size()) {
            for (int i = 0; i < notesList.size(); i++) {
                if (notesList.get(i).getId() != getNoteRecords().get(i).getId()) {
                    NotesRecord record = getNoteRecords().get(i);
                    getNoteRecords().remove(record);
                    return true;
                }
            }
        }

        // сохранение после изменения элемента в таблице
        if (notesList.size() == getNoteRecords().size()) {
            for (int i = 0; i < notesList.size(); i++) {
                if (!notesList.get(i).getTitle().equals(getNoteRecords().get(i).getTitle()) || !notesList.get(i).getDetails().equals(getNoteRecords().get(i).getDetails())) {
                    Note note = notesList.get(i);
                    getNoteRecords().get(i).setTitle(note.getTitle());
                    getNoteRecords().get(i).setDetails(note.getDetails());
                    getNoteRecords().get(i).setEditDate(note.getEditDate());
                }
            }
            return true;
        }
        return false;
    }

    /**
     * получаем и возвращаем список всех записей в таблице
     *
     * @return
     */
    private List<NotesRecord> getNoteRecords() {
        return ((NotesDatabase) database).getNotesTable().getRecords();
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }
}
