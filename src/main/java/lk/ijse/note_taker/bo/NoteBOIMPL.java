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
        return false;
    }

    @Override
    public boolean deleteNote(String id) {
        return false;
    }

    @Override
    public NoteDTO getNoteById(String id) {
        return null;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return null;
    }
}
