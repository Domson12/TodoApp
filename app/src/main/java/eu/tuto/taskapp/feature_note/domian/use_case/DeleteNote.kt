package eu.tuto.taskapp.feature_note.domian.use_case

import eu.tuto.taskapp.feature_note.domian.model.Note
import eu.tuto.taskapp.feature_note.domian.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}