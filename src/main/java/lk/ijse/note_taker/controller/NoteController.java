package lk.ijse.note_taker.controller;

import lk.ijse.note_taker.bo.NoteBO;
import lk.ijse.note_taker.dto.NoteDTO;
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
        String res = noteBO.saveNote(note);
        return ResponseEntity.ok(res);
    }

    //Todo: Get all notes
    @GetMapping(value = "allnotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDTO> getAllNotes() {
        return noteBO.getAllNotes();
    }

    //Todo: Get a note by ID
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO getNote(@PathVariable ("id") String noteId)  {
        return noteBO.getNoteById(noteId);
    }

    //Todo: Update a note
    @PatchMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateNote(@PathVariable("id") String id, @RequestBody NoteDTO note) {
        noteBO.updateNote(note);
    }

    //Todo: Delete a note
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteNote(@PathVariable("id") String id) {
        noteBO.deleteNote(id);
    }
}










