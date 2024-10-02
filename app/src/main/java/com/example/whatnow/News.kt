package com.example.whatnow

data class News(
    val artricles: ArrayList<Article>

)


data class Article(

    var title: String ,
    var url: String ,
    var urlToImage: String

)


