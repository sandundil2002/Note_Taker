package lk.ijse.note_taker.util;

import lk.ijse.note_taker.dto.impl.NoteDTO;
import lk.ijse.note_taker.dto.impl.UserDTO;
import lk.ijse.note_taker.entity.NoteEntity;
import lk.ijse.note_taker.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MappingUtil {
    @Autowired
    private ModelMapper modelMapper;

    //matters of note entity & dto
    public NoteDTO noteConvertToDTO(NoteEntity entity){
        return modelMapper.map(entity, NoteDTO.class);
    }

    public NoteEntity noteConvertToEntity(NoteDTO dto){
        return modelMapper.map(dto, NoteEntity.class);
    }

    public List<NoteDTO> noteConvertToDTOList(List<NoteEntity> entities){
        return modelMapper.map(entities, List.class);
    }

    //matters of user entity & dto
    public UserDTO userConvertToDTO(UserEntity entity){
        return modelMapper.map(entity, UserDTO.class);
    }

    public UserEntity userConvertToEntity(UserDTO dto){
        return modelMapper.map(dto, UserEntity.class);
    }

    public List<UserDTO> userConvertToDTOList(List<UserEntity> entities){
        return modelMapper.map(entities, List.class);
    }

}
