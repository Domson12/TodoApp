package eu.tuto.taskapp.feature_note.data.repository

import eu.tuto.taskapp.feature_note.data.data_source.NoteDao
import eu.tuto.taskapp.feature_note.domian.model.Note
import eu.tuto.taskapp.feature_note.domian.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}