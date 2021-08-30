package com.dio.api_nybooks_studie_app.model

data class Post (
    val results: List<BookDetails>,
        )

data class BookDetails(
    val book_details: List<Results>
)

data class Results(
    val title: String,
    val author: String
)

