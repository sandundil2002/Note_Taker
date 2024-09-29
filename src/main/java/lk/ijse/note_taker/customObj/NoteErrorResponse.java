package lk.ijse.note_taker.customObj;

import java.io.Serializable;

public class NoteErrorResponse implements NoteResponse, Serializable {
    private int errorCode;
    private String errorMessage;
}
