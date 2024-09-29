package lk.ijse.note_taker.dto.impl;

import lk.ijse.note_taker.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteDTO implements SuperDTO {
    private String id;
    private String noteTitle;
    private String noteDescription;
    private String priorityLevel;
    private String createdDateTime;
    private String userId;
}
