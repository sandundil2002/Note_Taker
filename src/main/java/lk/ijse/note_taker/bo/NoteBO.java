package lk.ijse.note_taker.bo;

import lk.ijse.note_taker.dto.NoteDTO;

import java.util.List;

public sealed interface NoteBO permits NoteBOIMPL{
    String saveNote(NoteDTO noteDTO);
    boolean updateNote(NoteDTO noteDTO);
    boolean deleteNote(String id);
    NoteDTO getNoteById(String id);
    List<NoteDTO> getAllNotes();
}