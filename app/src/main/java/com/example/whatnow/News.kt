package com.example.whatnow

data class News(
    val articles: ArrayList<Article>

)


data class Article(

    var title: String ,
    var url: String ,
    var urlToImage: String

)


