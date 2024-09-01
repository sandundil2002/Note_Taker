package lk.ijse.note_taker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "notes")
@Entity
public class NoteEntity implements SuperEntity {
    @Id
    private String noteId;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private UserEntity user;
    private String noteTitle;
    private String noteDescription;
    private String priorityLevel;
    private String createdDateTime;
}
