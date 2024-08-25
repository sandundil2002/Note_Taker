package lk.ijse.note_taker.service;

public sealed interface NoteService permits NoteServiceIMPL {
    String saveNote();
    boolean updateNote();
    boolean deleteNote();
    String getNoteById();
    String getAllNotes();
}
