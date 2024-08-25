package lk.ijse.note_taker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "notes")
@Entity
public class NoteEntity {
    @Id
    private String id;
    private String noteTitle;
    private String noteDescription;
    private String priorityLevel;
    private String createdDateTime;
}
