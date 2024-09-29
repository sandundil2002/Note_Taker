package lk.ijse.note_taker.service;

import lk.ijse.note_taker.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    String saveNote(NoteDTO noteDTO);
    void updateNote(String id, NoteDTO noteDTO);
    boolean deleteNote(String id);
    NoteDTO getNoteById(String id);
    List<NoteDTO> getAllNotes();
}