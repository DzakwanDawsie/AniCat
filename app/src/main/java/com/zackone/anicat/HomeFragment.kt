package com.zackone.anicat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.zackone.anicat.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.mainRvAnime.layoutManager = GridLayoutManager(context, 3)

        showRecycleView()

        return binding.root
    }

    fun showRecycleView() {
        val animes = listOf(
            Anime(
                "Josee to Tora to Sakanatachi",
                "The story centers on the relationship between Tsuneo and Josee. Tsuneo is a university student, and Josee is a young girl who has rarely gone out of the house by herself due to her being unable to walk. The two meet when Tsuneo finds Josee's grandmother taking her out for a morning walk.",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx113596-LKA0bYJGjLnB.jpg",
                "Bones",
                2020,
                "Fall"
            ),
            Anime(
                "Tsue to Tsurugi no Wistoria",
                "A hard-working boy named Will enters a magic academy in hopes of becoming a great sorcerer. Unfortunately, there's a fatal flaw in his plan: he lacks the ability to use magic. Amid the cold stares of his classmates and instructors, Will feels discouraged at times, but he presses forward with unwavering determination. He can't use a wand, but he can wield a sword in his battle to reach the top of a magic-dominated world. He just needs to believe in his own unique strengths and remember the promise he made with someone precious to him...",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx174576-tpKcHG0eO6CS.jpg",
                "Actas, Bandai Namco Pictures",
                2024,
                "Summer"
            ),
            Anime(
                "Kami no Tou: Tower of God - Ouji no Kikan",
                "The second season of Kami no Tou: Tower of God.\n" + "\n" + "Ja Wangnan can’t seem to pass the 20th Floor. Even after failing time and time again, he refuses to give up. On his journey, he meets a mysterious and powerful character named Viole. Wangnan invites Viole to join his team of Regulars. Their journey continues with new challenges at every turn.",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx153406-dU2RLKgMUF2U.jpg",
                "The Answer Studio",
                2024,
                "Summer"
            ),
            Anime(
                "[Oshi no Ko] 2nd Season",
                "The second season of [Oshi no Ko].\n" + "\n" + "Aqua’s desire for revenge takes center stage as he navigates the dark underbelly of the entertainment world alongside his twin sister, Ruby. While Ruby follows in their slain mother’s footsteps to become an idol, Aqua joins a famous theater troupe in hopes of uncovering clues to the identity of his father — the man who arranged their mother’s untimely death, and the man who once starred in the same troupe Aqua hopes to infiltrate.",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx166531-dAL5MsqDHUkj.jpg",
                "Doga Kobo",
                2024,
                "Summer"
            ),
            Anime(
                "Re:Zero kara Hajimeru Isekai Seikatsu 3rd Season",
                "The third season of Re:Zero kara Hajimeru Isekai Seikatsu.\n" + "\n" + "A year has passed since Subaru’s victory at the Sanctuary. He savors a life of fulfillment while Emilia’s camp stands united for the royal selection—until a fateful letter arrives. Anastasia, a royal selection candidate, has invited Emilia to the Watergate City of Priestella. But as the party begins its journey, crisis stirs beneath the surface and Subaru meets a cruel fate once again.\n",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx163134-e7ff17XOlj10.png",
                "White Fox",
                2024,
                "Fall"
            ),
            Anime(
                "Sousou no Frieren",
                "The adventure is over but life goes on for an elf mage just beginning to learn what living is all about. Elf mage Frieren and her courageous fellow adventurers have defeated the Demon King and brought peace to the land. But Frieren will long outlive the rest of her former party. How will she come to understand what life means to the people around her? Decades after their victory, the funeral of one her friends confronts Frieren with her own near immortality. Frieren sets out to fulfill the last wishes of her comrades and finds herself beginning a new adventure…\n",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx154587-gHSraOSa0nBG.jpg",
                "MADHOUSE",
                2023,
                "Fall"
            ),
            Anime(
                "Violet Evergarden",
                "A certain point in time, in the continent of Telesis. The great war which divided the continent into North and South has ended after four years, and the people are welcoming a new generation. Violet Evergarden, a young girl formerly known as “the weapon”, has left the battlefield to start a new life at CH Postal Service. There, she is deeply moved by the work of “Auto Memories Dolls”, who carry people's thoughts and convert them into words. Violet begins her journey as an Auto Memories Doll, and comes face to face with various people's emotions and differing shapes of love. There are words Violet heard on the battlefield, which she cannot forget. These words were given to her by someone she holds dear, more than anyone else. She does not yet know their meaning but she searches to find it.",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/nx21827-10F6m50H4GJK.png",
                "Kyoto Animation",
                2018,
                "Winter"
            ),
            Anime(
                "Fumetsu no Anata e",
                "In the beginning, an \"orb\" is cast unto Earth. \"It\" can do two things: change into the form of the thing that stimulates \"it\"; and come back to life after death. \"It\" morphs from orb to rock, then to wolf, and finally to boy, but roams about like a newborn who knows nothing. As a boy, \"it\" becomes Fushi.\n" + "\n" + "Through encounters with human kindness, Fushi not only gains survival skills but grows as a \"person\". But his journey is darkened by the inexplicable and destructive enemy Nokker and cruel partings with the people he loves.\n",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx114535-y3NnjexcqKG1.jpg",
                "Brain's Base",
                2021,
                "Spring"
            ),
            Anime(
                "Koe no Katachi",
                "After transferring into a new school, a deaf girl, Shouko Nishimiya, is bullied by the popular Shouya Ishida. As Shouya continues to bully Shouko, the class turns its back on him. Shouko transfers and Shouya grows up as an outcast. Alone and depressed, the regretful Shouya finds Shouko to make amends.\n",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx20954-UMb6Kl7ZL8Ke.jpg",
                "Kyoto Animation",
                2016,
                "Summer"
            ),
            Anime(
                "Kimi no Suizou wo Tabetai",
                "Spring time in April and the last of the cherry blossoms are still in bloom. The usually aloof bookworm with no interest in others comes across a book in a hospital waiting room. Handwritten on the cover are the words: \"Living with Dying.\" He soon discovers that it is a diary kept by his very popular and genuinely cheerful classmate, Sakura Yamauchi, who reveals to him that she is secretly suffering from a pancreatic illness and only has a limited time left. It is at this moment that she gains just one more person to share her secret.\n" + "\n" + "Trying to maintain a normal life as much as possible, Sakura is determined to live her life to the fullest until the very last day. As her free spirit and unpredictable actions throw him for a loop, his heart begins to gradually change.\n",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx99750-NHafozHS8zRp.jpg",
                "Studio VOLN",
                2018,
                "Summer"
            ),
            Anime(
                "Kimi no Na wa",
                "Mitsuha Miyamizu, a high school girl, yearns to live the life of a boy in the bustling city of Tokyo—a dream that stands in stark contrast to her present life in the countryside. Meanwhile in the city, Taki Tachibana lives a busy life as a high school student while juggling his part-time job and hopes for a future in architecture.\n" + "\n" + "One day, Mitsuha awakens in a room that is not her own and suddenly finds herself living the dream life in Tokyo—but in Taki's body! Elsewhere, Taki finds himself living Mitsuha's life in the humble countryside. In pursuit of an answer to this strange phenomenon, they begin to search for one another.\n" + "\n" + "Kimi no Na wa. revolves around Mitsuha and Taki's actions, which begin to have a dramatic impact on each other's lives, weaving them into a fabric held together by fate and circumstance.\n",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx21519-fPhvy69vnQqS.png",
                "CoMix Wave",
                2016,
                "Summer"
            ),
            Anime(
                "Tenki no Ko",
                "High school student Hodaka leaves his home on an isolated island and moves to Tokyo, but he immediately becomes broke. He lives his days in isolation, but finally finds a job as a writer for a shady occult magazine. After he starts his job, the weather has been rainy day after day. In a corner of the crowded and busy city, Hodaka meets a young woman named Hina. Due to certain circumstances, Hina and her younger brother live together, but have a cheerful and sturdy life. Hina also has a certain power: the power to stop the rain and clear the sky.\n",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx106286-5COcpd0J9VbL.png",
                "CoMix Wave",
                2019,
                "Summer"
            ),
        )

        val adapter = AnimeRecycleViewAdapter(animes)
        binding.mainRvAnime.adapter = adapter
    }
}