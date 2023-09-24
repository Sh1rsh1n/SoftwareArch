package ru.geekbrains.lesson6;


import ru.geekbrains.lesson6.database.NotesDatabase;
import ru.geekbrains.lesson6.notes.core.application.ConcreteNoteEditor;
import ru.geekbrains.lesson6.notes.core.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.NotesDbContext;
import ru.geekbrains.lesson6.notes.presentation.queries.controllers.NotesController;
import ru.geekbrains.lesson6.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));

        System.out.println("\n================\nLIST NOTES\n================\n");
        controller.routeGetAll();

        System.out.println("\n================\nAFTER ADD NOTE\n================\n");
        Note addNote = new Note(1, 1, "note #1", "note #1 details");
        controller.routeAddNote(addNote);
        controller.routeGetAll();

        System.out.println("\n================\nAFTER EDIT NOTE\n================\n");
        Note editNote = new Note(1001, 1001, "note #1001", "note details #1001");
        controller.routeEditNote(editNote);
        controller.routeGetAll();

        System.out.println("\n================\nAFTER REMOVE NOTE\n================\n");
        Note removeNote1 = new Note(1001, 1001, "note #1001", "note details #1001");
        Note removeNote2 = new Note(1, 1, "note #1", "note #1 details");
        controller.routeRemoveNote(removeNote1);
        controller.routeRemoveNote(removeNote2);
        controller.routeGetAll();
    }

}
