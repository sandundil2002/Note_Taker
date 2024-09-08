package lk.ijse.note_taker.controller;

import lk.ijse.note_taker.service.NoteService;
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

    //Add health check
    @GetMapping(value = "/health")
    public String healthCheck() {
        System.out.println("Note Taker API is running");
        return "Note Taker API is running";
    }

    @Autowired
    private final NoteService noteService;

    //Save a note
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveNote(@RequestBody NoteDTO note) {
        String res = noteService.saveNote(note);
        return ResponseEntity.ok(res);
    }

    //Get all notes
    @GetMapping(value = "allnotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDTO> getAllNotes() {
        return noteService.getAllNotes();
    }

    //Get a note by ID
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO getNote(@PathVariable ("id") String noteId)  {
        return noteService.getNoteById(noteId);
    }

    //Update a note
    @PatchMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateNote(@RequestBody NoteDTO note) {
        return noteService.updateNote(note) ? ResponseEntity.ok("Note updated successfully") : ResponseEntity.badRequest().body("Failed to update the note");
    }

    //Delete a note
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteNote(@PathVariable("id") String id) {
        return noteService.deleteNote(id) ? ResponseEntity.ok("Note deleted successfully") : ResponseEntity.badRequest().body("Failed to delete the note");
    }

}










