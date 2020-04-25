package com.badkrist.eurovision.model

data class Song(
    var countryCode: String? = "",
    var img: String? = "",
    var link: String? = "",
    var number: Int? = 0,
    var title: String? = ""
)