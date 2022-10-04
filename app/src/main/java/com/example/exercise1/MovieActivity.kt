package com.example.exercise1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_experiment)
        val rvMovie = findViewById<RecyclerView>(R.id.rv_movie)
        val rvMovieAdapter = MovieAdapter {
            intent = Intent(this, MovieDetailActivity::class.java)
            intent.putExtra("title", it.title)
            intent.putExtra("poster", it.image)
            intent.putExtra("description", it.description)
            startActivity(intent)
        }
        val movies = arrayListOf(
            Movie(
                "Rick And Morty",
                "/cvhNj9eoRBe5SxjCbQTkh05UP5K.jpg",
                "Rick is a mentally-unbalanced but scientifically gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school."
            ),
            Movie(
                "She Hulk",
                "/hJfI6AGrmr4uSHRccfJuSsapvOb.jpg",
                "Jennifer Walters navigates the complicated life of a single, 30-something attorney who also happens to be a green 6-foot-7-inch superpowered hulk."
            ),
            Movie(
                "Lord of The Ring",
                "/57qMrgNoh72wF5sVEDrtMlRk7D.jpg",
                "Beginning in a time of relative peace, we follow an ensemble cast of characters as they confront the re-emergence of evil to Middle-earth. From the darkest depths of the Misty Mountains, to the majestic forests of Lindon, to the breathtaking island kingdom of Númenor, to the furthest reaches of the map, these kingdoms and characters will carve out legacies that live on long after they are gone."
            ),
            Movie(
                "House of Dragon",
                "/Aa9TLpNpBMyRkD8sPJ7ACKLjt0l.jpg",
                "The Targaryen dynasty is at the absolute apex of its power, with more than 15 dragons under their yoke. Most empires crumble from such heights. In the case of the Targaryens, their slow fall begins when King Viserys breaks with a century of tradition by naming his daughter Rhaenyra heir to the Iron Throne. But when Viserys later fathers a son, the court is shocked when Rhaenyra retains her status as his heir, and seeds of division sow friction across the realm."
            ),
            Movie(
                "Cobra Kai",
                "/m7tG5E1EbywuwTsl6hq990So0Bx.jpg",
                "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi."
            ),
            Movie(
                "War of the Worlds",
                "/yThmbQkxSzW4HHdAaoj8RYHFH3i.jpg",
                "When astronomers detect a transmission from another galaxy, it is definitive proof of intelligent extra-terrestrial life. The world’s population waits for further contact with bated breath. They do not have to wait long. Within days, mankind is all but wiped out by a devastating attack; pockets of humanity are left in an eerily deserted world. As aliens hunt and kill those left alive, the survivors ask a burning question – who are these attackers and why are they hell-bent on our destruction?"
            ),
            Movie(
                "Grey's Anatomy",
                "/daSFbrt8QCXV2hSwB0hqYjbj681.jpg",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital."
            ),
        )
        rvMovieAdapter.setData(movies)
        rvMovie.adapter = rvMovieAdapter
    }
}