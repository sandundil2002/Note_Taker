package lk.ijse.note_taker.service;

import lk.ijse.note_taker.dto.NoteDTO;
import lk.ijse.note_taker.util.AppUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public final class NoteServiceIMPL implements NoteService {
    List<NoteDTO> saveNoteTemp = new ArrayList<>();

    public NoteServiceIMPL() {
        saveNoteTemp.add(new NoteDTO("1", "Note 1", "This is note 1","P1","2021-09-01 10:00:00"));
        saveNoteTemp.add(new NoteDTO("2", "Note 2", "This is note 2", "P2","2021-09-01 10:00:00"));
        saveNoteTemp.add(new NoteDTO("3", "Note 3", "This is note 3", "P3","2021-09-01 10:00:00"));
        saveNoteTemp.add(new NoteDTO("4", "Note 4", "This is note 4", "P4","2021-09-01 10:00:00"));
        saveNoteTemp.add(new NoteDTO("5", "Note 5", "This is note 5", "P5","2021-09-01 10:00:00"));
    }

    @Override
    public String saveNote(NoteDTO noteDTO) {
        noteDTO.setId(AppUtil.generateID());
        saveNoteTemp.add(noteDTO);
        System.out.println("Note saved successfully "+noteDTO);
        return "Note saved successfully BO layer";
    }

    @Override
    public boolean updateNote(NoteDTO noteDTO) {
        ListIterator<NoteDTO> updatedList = saveNoteTemp.listIterator();
        while (updatedList.hasNext()) {
            NoteDTO note = updatedList.next();
            if (note.getId().equals(noteDTO.getId())) {
                updatedList.set(noteDTO);
                System.out.println("Note updated successfully "+noteDTO);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteNote(String id) {
        for (NoteDTO noteDTO : saveNoteTemp) {
            if (noteDTO.getId().equals(id)) {
                saveNoteTemp.remove(noteDTO);
                System.out.println("Note deleted successfully "+noteDTO);
                return true;
            }
        }
        return false;
    }

    @Override
    public NoteDTO getNoteById(String id) {
        for (NoteDTO noteDTO : saveNoteTemp) {
            if (noteDTO.getId().equals(id)) {
                System.out.println("Get note by ID "+noteDTO);
                return noteDTO;
            }
        }
        return null;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        System.out.println("Get all notes "+saveNoteTemp.toString());
        return saveNoteTemp;
    }
}
