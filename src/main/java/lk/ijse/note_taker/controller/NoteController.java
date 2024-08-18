package lk.ijse.note_taker.controller;

import lk.ijse.note_taker.bo.NoteBO;
import lk.ijse.note_taker.dto.NoteDTO;
import lk.ijse.note_taker.util.AppUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
@RequiredArgsConstructor
public class NoteController {
    @Autowired
    private final NoteBO noteBO;

    //Todo: Save a note
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveNote(@RequestBody NoteDTO note) {
        //Todo: Handle with BO
        String req = noteBO.saveNote(note);
        return ResponseEntity.ok(req);
    }

    //Todo: Get all notes
    @GetMapping(value = "allnotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDTO> getAllNotes() {
        System.out.println("Get All Notes");
        return null;
    }

    //Todo: Get a note by ID
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO getNoteById(@PathVariable("id") String id) {
        System.out.println("Get Note By ID: " + id);
        return new NoteDTO(
                id,
                "Note Title",
                "Note Description",
                "Priority Level",
                AppUtil.getCurrentDateTime()
        );
    }

    //Todo: Update a note
    @PatchMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateNote(@PathVariable String id, @RequestBody NoteDTO note) {
        note.setCreatedDateTime(AppUtil.getCurrentDateTime());
        System.out.println("Update Note ID: " + id);
        System.out.println("Update Note Title: " + note.getNoteTitle());
        System.out.println("Update Note Description: " + note.getNoteDescription());
        System.out.println("Update Priority Level: " + note.getPriorityLevel());
        System.out.println("Updated Date Time: " + note.getCreatedDateTime());
    }

    //Todo: Delete a note
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteNoteById(@PathVariable("id") String id) {
        System.out.println("Delete Note ID: " + id);
    }
}
