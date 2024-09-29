package lk.ijse.note_taker.service.impl;

import lk.ijse.note_taker.customObj.NoteErrorResponse;
import lk.ijse.note_taker.customObj.NoteResponse;
import lk.ijse.note_taker.dao.NoteDAO;
import lk.ijse.note_taker.dto.impl.NoteDTO;
import lk.ijse.note_taker.entity.NoteEntity;
import lk.ijse.note_taker.exception.NoteNotFoundException;
import lk.ijse.note_taker.service.NoteService;
import lk.ijse.note_taker.util.AppUtil;
import lk.ijse.note_taker.util.MappingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NoteServiceIMPL implements NoteService {

    @Autowired
    private NoteDAO noteDAO;

    @Autowired
    private MappingUtil mappingUtil;

    @Override
    public String saveNote(NoteDTO noteDTO) {
        noteDTO.setId(AppUtil.generateNoteID());
        NoteEntity noteEntity = mappingUtil.noteConvertToEntity(noteDTO);
        noteDAO.save(noteEntity);
        System.out.println("Note saved : " + noteEntity);
        return "Note saved successfully";
    }

    @Override
    public void updateNote(String id , NoteDTO noteDTO) {
        Optional<NoteEntity> tmpNoteEntity= noteDAO.findById(id);
        if(!tmpNoteEntity.isPresent()){
            throw new NoteNotFoundException("Note not found");
        }else {
            tmpNoteEntity.get().setNoteTitle(noteDTO.getNoteTitle());
            tmpNoteEntity.get().setNoteDescription(noteDTO.getNoteDescription());
            tmpNoteEntity.get().setCreatedDateTime(noteDTO.getCreatedDateTime());
            tmpNoteEntity.get().setPriorityLevel(noteDTO.getPriorityLevel());
            System.out.println("Note updated : " + noteDTO);
        }
    }

    @Override
    public boolean deleteNote(String id) {
        if (noteDAO.existsById(id)){
            noteDAO.deleteById(id);
            System.out.println("Note deleted : " + id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public NoteResponse getNoteById(String id) {
        if (noteDAO.existsById(id)){
            return mappingUtil.noteConvertToDTO(noteDAO.getReferenceById(id));
        } else {
            throw new NoteNotFoundException("Note not found");
        }
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return mappingUtil.noteConvertToDTOList(noteDAO.findAll());
    }

}