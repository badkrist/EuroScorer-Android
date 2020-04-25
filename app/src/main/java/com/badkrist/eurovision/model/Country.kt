package com.badkrist.eurovision.model

import com.squareup.moshi.Json

data class Country(
    @field:Json(name = "flag") val flag: String? = "",
    @field:Json(name = "name") val name: String? = ""
)