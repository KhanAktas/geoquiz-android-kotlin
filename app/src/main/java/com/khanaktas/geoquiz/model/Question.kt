package com.khanaktas.geoquiz.model

import androidx.annotation.StringRes

data class Question(
    @StringRes val textResId: Int,
    val correctAnswer: Boolean
)