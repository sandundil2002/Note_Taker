package lk.ijse.note_taker.controller;

import lk.ijse.note_taker.dto.Note;
import lk.ijse.note_taker.util.AppUtil;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {
    //Todo: Save a note
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveNote(@RequestBody Note note) {
        //Todo: Handle with BO
        note.setId(AppUtil.generateID());
        note.setCreatedDateTime(AppUtil.getCurrentDateTime());
        System.out.println("Note ID: " + note.getId());
        System.out.println("Note Title: " + note.getNoteTitle());
        System.out.println("Note Description: " + note.getNoteDescription());
        System.out.println("Priority Level: " + note.getPriorityLevel());
        System.out.println("Created Date Time: " + note.getCreatedDateTime());
        return ResponseEntity.ok("Note saved successfully");
    }
}
