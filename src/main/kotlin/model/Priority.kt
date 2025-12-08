package model

enum class Priority {
    VERY_URGENT,
    URGENT,
    NOT_URGENT;

    companion object {
        fun fromString(value: String?): Priority =
            when (value?.lowercase()) {
                "very urgent" -> VERY_URGENT
                "urgent" -> URGENT
                "not urgent" -> NOT_URGENT
                else -> NOT_URGENT
            }
    }

    fun toDisplayString(): String =
        when (this) {
            VERY_URGENT -> "very urgent"
            URGENT -> "urgent"
            NOT_URGENT -> "not urgent"
        }
}