package lk.ijse.note_taker.util;

import lk.ijse.note_taker.dto.NoteDTO;
import lk.ijse.note_taker.entity.NoteEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MappingUtil {
    @Autowired
    private ModelMapper modelMapper;

    //matters of note entity & dto
    public NoteDTO convertToDTO(NoteEntity entity){
        return modelMapper.map(entity, NoteDTO.class);
    }

    public NoteEntity convertToEntity(NoteDTO dto){
        return modelMapper.map(dto, NoteEntity.class);
    }

    public List<NoteDTO> convertToDTOList(List<NoteEntity> entities){
        return modelMapper.map(entities, List.class);
    }
}
