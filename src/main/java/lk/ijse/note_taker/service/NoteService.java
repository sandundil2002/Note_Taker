package lk.ijse.note_taker.service;

import lk.ijse.note_taker.dto.NoteDTO;

import java.util.List;

public interface NoteService {
    String saveNote(NoteDTO noteDTO);
    Boolean updateNote(NoteDTO noteDTO);
    boolean deleteNote(String id);
    NoteDTO getNoteById(String id);
    List<NoteDTO> getAllNotes();
}