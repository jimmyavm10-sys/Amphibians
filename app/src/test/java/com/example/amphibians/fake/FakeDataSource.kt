package com.example.amphibians.fake

import com.example.amphibians.model.Amphibian

object FakeDataSource {
    val amphibiansList = listOf(
        Amphibian(
            name = "Frog",
            type = "Frog",
            description = "A green frog",
            imgSrc = "url.1"
        ),
        Amphibian(
            name = "Toad",
            type = "Toad",
            description = "A brown toad",
            imgSrc = "url.2"
        )
    )
}
