package lk.ijse.note_taker.service;

public final class NoteServiceIMPL implements NoteService {
    @Override
    public String saveNote() {
        return "Note saved successfully Service layer";
    }

    @Override
    public boolean updateNote() {
        System.out.println("Update note Service layer");
        return true;
    }

    @Override
    public boolean deleteNote() {
        System.out.println("Delete note Service layer");
        return true;
    }

    @Override
    public String getNoteById() {
        System.out.println("Get note by ID Service layer");
        return null;
    }

    @Override
    public String getAllNotes() {
        System.out.println("Get all notes Service layer");
        return null;
    }
}
