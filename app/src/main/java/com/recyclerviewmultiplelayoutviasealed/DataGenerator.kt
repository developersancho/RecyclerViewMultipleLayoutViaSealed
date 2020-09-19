package com.recyclerviewmultiplelayoutviasealed

object DataGenerator {

    fun getMovie(): List<Movie> {
        return listOf(
            MovieCategory(categoryName = "Comedy"),
            MovieContent(
                title = "Gringo",
                image = "https://tr.web.img4.acsta.net/c_215_290/pictures/18/03/26/15/17/2640672.jpg"
            ),
            MovieContent(
                title = "3 Idiots",
                image = "https://upload.wikimedia.org/wikipedia/en/d/df/3_idiots_poster.jpg"
            ),
            MovieCategory(categoryName = "Action"),
            MovieContent(
                title = "John Wick",
                image = "https://upload.wikimedia.org/wikipedia/tr/9/98/John_Wick_TeaserPoster.jpg"
            ),
            MovieContent(
                title = "John Wick 2",
                image = "https://i5.walmartimages.com/asr/f7d45343-2805-4451-8b03-0174d7b34078_1.73f860048119d838703f4e2067354def.jpeg"
            ),
            MovieContent(
                title = "John Wick 3",
                image = "https://images-na.ssl-images-amazon.com/images/I/91wc7yc2R8L._SL1500_.jpg"
            ),
            MovieCategory(categoryName = "Fantastic"),
            MovieContent(
                title = "Dr.Dolittle",
                image = "https://resim.fullhdfilmizlesene.com/mdsresim_izle/fullhd-doktor-dolittle-in-yolculugu-izle.jpg"
            )
        )
    }
}