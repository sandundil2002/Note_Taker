package lk.ijse.note_taker.bo;

import lk.ijse.note_taker.dto.NoteDTO;
import lk.ijse.note_taker.util.AppUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class NoteBOIMPL implements NoteBO {
    @Override
    public String saveNote(NoteDTO noteDTO) {
        noteDTO.setId(AppUtil.generateID());
        noteDTO.setCreatedDateTime(AppUtil.getCurrentDateTime());
        System.out.println(noteDTO);
        return "Note saved successfully BO layer";
    }

    @Override
    public boolean updateNote(NoteDTO noteDTO) {
        System.out.println("Update note BO layer");
        return true;
    }

    @Override
    public boolean deleteNote(String id) {
        System.out.println("Delete note BO layer");
        return true;
    }

    @Override
    public NoteDTO getNoteById(String id) {
        System.out.println("Get note by ID BO layer");
        return null;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        System.out.println("Get all notes BO layer");
        return null;
    }
}
