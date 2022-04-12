package eu.tuto.taskapp.feature_note.domian.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
