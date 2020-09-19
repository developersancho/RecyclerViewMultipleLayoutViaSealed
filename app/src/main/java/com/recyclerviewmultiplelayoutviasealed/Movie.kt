package com.recyclerviewmultiplelayoutviasealed

sealed class Movie
class MovieCategory(var categoryName: String = "") : Movie()
class MovieContent(var title: String = "", var image: String = "") : Movie()