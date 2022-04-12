package eu.tuto.taskapp.feature_note.domian.use_case

import eu.tuto.taskapp.feature_note.domian.model.Note
import eu.tuto.taskapp.feature_note.domian.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}