package lk.ijse.note_taker.service;

import lk.ijse.note_taker.dao.NoteDAO;
import lk.ijse.note_taker.dto.NoteDTO;
import lk.ijse.note_taker.entity.NoteEntity;
import lk.ijse.note_taker.util.AppUtil;
import lk.ijse.note_taker.util.MappingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NoteServiceIMPL implements NoteService {

    @Autowired
    private NoteDAO noteDAO;

    @Autowired
    private MappingUtil mappingUtil;

    @Override
    public String saveNote(NoteDTO noteDTO) {
        noteDTO.setId(AppUtil.generateID());
        NoteEntity noteEntity = mappingUtil.convertToEntity(noteDTO);
        noteDAO.save(noteEntity);
        System.out.println("Note saved : " + noteEntity);
        return "Note saved successfully";
    }

    @Override
    public boolean updateNote(NoteDTO noteDTO) {
        if (noteDAO.existsById(noteDTO.getId())){
            NoteEntity noteEntity = mappingUtil.convertToEntity(noteDTO);
            noteDAO.save(noteEntity);
            System.out.println("Note updated : " + noteEntity);
            return true;
        } else {
            return false;
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
    public NoteDTO getNoteById(String id) {
        NoteEntity noteEntity = noteDAO.findById(id).get();
        System.out.println("Get note by id : " + noteEntity);
        return mappingUtil.convertToDTO(noteEntity);
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        List<NoteEntity> noteEntities = noteDAO.findAll();
        System.out.println("Get all notes : " + noteEntities);
        return mappingUtil.convertToDTOList(noteEntities);
    }

}