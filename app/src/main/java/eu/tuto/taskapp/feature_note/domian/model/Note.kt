package eu.tuto.taskapp.feature_note.domian.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import eu.tuto.taskapp.ui.theme.*
import java.lang.Exception

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNOteException(message: String): Exception(message)