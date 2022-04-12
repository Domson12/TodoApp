package eu.tuto.taskapp.feature_note.domian.use_case

import eu.tuto.taskapp.feature_note.domian.model.InvalidNOteException
import eu.tuto.taskapp.feature_note.domian.model.Note
import eu.tuto.taskapp.feature_note.domian.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNOteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNOteException("Tytuł nie może być pusty")
        }
        if (note.content.isBlank()) {
            throw InvalidNOteException("Zawartość notatki nie może być pusta")
        }
        repository.insertNote(note)
    }
}