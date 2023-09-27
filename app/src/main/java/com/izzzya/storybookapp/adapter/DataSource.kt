package com.izzzya.storybookapp.adapter

import com.izzzya.storybookapp.R

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val description: String,
    val cover: Int,
    val tags: List<String>,
    val text: String
)

class DataSource {

    companion object{
        val booksList = listOf<Book>(
            Book(
                0,
                "How I Found Livingstone",
                "Sir Henry M. Stanley",
                "Riveting firsthand account of the long and arduous search by journalist/adventurer for one of the great explorers of the 19th century.",
                R.drawable.hifl,
                listOf("Travelling", "History"),
                "CHAPTER I.— INTRODUCTORY. MY INSTRUCTIONS TO FIND AND RELIEVE LIVINGSTONE.\n" +
                        "On the sixteenth day of October, in the year of our Lord one thousand eight hundred and sixty-nine, I was in Madrid, fresh from the carnage at Valencia. At 10 A.M. Jacopo, at No.— Calle de la Cruz, handed me a telegram: It read, \"Come to Paris on important business.\" The telegram was from Mr. James Gordon Bennett, jun., the young manager of the 'New York Herald.'\n" +
                        "\n" +
                        "Down came my pictures from the walls of my apartments on the second floor; into my trunks went my books and souvenirs, my clothes were hastily collected, some half washed, some from the clothes-line half dry, and after a couple of hours of hasty hard work my portmanteaus were strapped up and labelled \"Paris.\"\n" +
                        "\n" +
                        "At 3 P.M. I was on my way, and being obliged to stop at Bayonne a few hours, did not arrive at Paris until the following night. I went straight to the 'Grand Hotel,' and knocked at the door of Mr. Bennett's room.\n" +
                        "\n" +
                        "\"Come in,\" I heard a voice say. Entering, I found Mr. Bennett in bed. \"Who are you?\" he asked.\n" +
                        "\n" +
                        "\"My name is Stanley,\" I answered.\n" +
                        "\n" +
                        "\"Ah, yes! sit down; I have important business on hand for you.\"\n" +
                        "\n" +
                        "After throwing over his shoulders his robe-de-chambre Mr. Bennett asked, \"Where do you think Livingstone is?\"\n" +
                        "\n" +
                        "\"I really do not know, sir.\"\n" +
                        "\n" +
                        "\"Do you think he is alive?\"\n" +
                        "\n" +
                        "\"He may be, and he may not be,\" I answered.\n" +
                        "\n" +
                        "\"Well, I think he is alive, and that he can be found, and I am going to send you to find him.\"\n" +
                        "\n" +
                        "\"What!\" said I, \"do you really think I can find Dr Livingstone? Do you mean me to go to Central Africa?\"\n" +
                        "\n" +
                        "\"Yes; I mean that you shall go, and find him wherever you may hear that he is, and to get what news you can of him, and perhaps\"—delivering himself thoughtfully and deliberately—\"the old man may be in want:—take enough with you to help him should he require it. Of course you will act according to your own plans, and do what you think best—BUT FIND LIVINGSTONE!\"\n" +
                        "\n" +
                        "Said I, wondering at the cool order of sending one to Central Africa to search for a man whom I, in common with almost all other men, believed to be dead, \"Have you considered seriously the great expense you are likely, to incur on account of this little journey?\"\n" +
                        "\n" +
                        "\"What will it cost?\" he asked abruptly.\n" +
                        "\n" +
                        "\"Burton and Speke's journey to Central Africa cost between £3,000 and £5,000, and I fear it cannot be done under £2,500.\"\n" +
                        "\n" +
                        "\"Well, I will tell you what you will do. Draw a thousand pounds now; and when you have gone through that, draw another thousand, and when that is spent, draw another thousand, and when you have finished that, draw another thousand, and so on; but, FIND LIVINGSTONE.\"\n" +
                        "\n" +
                        "Surprised but not confused at the order—for I knew that Mr. Bennett when once he had made up his mind was not easily drawn aside from his purpose—I yet thought, seeing it was such a gigantic scheme, that he had not quite considered in his own mind the pros and cons of the case; I said, \"I have heard that should your father die you would sell the 'Herald' and retire from business.\"\n" +
                        "\n" +
                        "\"Whoever told you that is wrong, for there is not, money enough in New York city to buy the 'New York Herald.' My father has made it a great paper, but I mean to make it greater. I mean that it shall be a newspaper in the true sense of the word. I mean that it shall publish whatever news will be interesting to the world at no matter what cost.\"\n" +
                        "\n" +
                        "\"After that,\" said I, \"I have nothing more to say. Do you mean me to go straight on to Africa to search for Dr. Livingstone?\"\n" +
                        "\n" +
                        "\"No! I wish you to go to the inauguration of the Suez Canal first, and then proceed up the Nile. I hear Baker is about starting for Upper Egypt. Find out what you can about his expedition, and as you go up describe as well as possible whatever is interesting for tourists; and then write up a guide—a practical one—for Lower Egypt; tell us about whatever is worth seeing and how to see it.\n" +
                        "\n" +
                        "\"Then you might as well go to Jerusalem; I hear Captain Warren is making some interesting discoveries there. Then visit Constantinople, and find out about that trouble between the Khedive and the Sultan.\n" +
                        "\n" +
                        "\"Then—let me see—you might as well visit the Crimea and those old battle-grounds, Then go across the Caucasus to the Caspian Sea; I hear there is a Russian expedition bound for Khiva. From thence you may get through Persia to India; you could write an interesting letter from Persepolis.\n" +
                        "\n" +
                        "\"Bagdad will be close on your way to India; suppose you go there, and write up something about the Euphrates Valley Railway. Then, when you have come to India, you can go after Livingstone. Probably you will hear by that time that Livingstone is on his way to Zanzibar; but if not, go into the interior and find him. If alive, get what news of his discoveries you can; and if you find he is dead, bring all possible proofs of his being dead. That is all. Good-night, and God be with you.\"\n" +
                        "\n" +
                        "\"Good-night, Sir,\" I said, \"what it is in the power of human nature to do I will do; and on such an errand as I go upon, God will be with me.\"\n" +
                        "\n" +
                        "I lodged with young Edward King, who is making such a name in New England. He was just the man who would have delighted to tell the journal he was engaged upon what young Mr. Bennett was doing, and what errand I was bound upon.\n" +
                        "\n" +
                        "I should have liked to exchange opinions with him upon the probable results of my journey, but I dared not do so. Though oppressed with the great task before me, I had to appear as if only going to be present at the Suez Canal. Young King followed me to the express train bound for Marseilles, and at the station we parted: he to go and read the newspapers at Bowles' Reading-room—I to Central Africa and—who knows?\n" +
                        "\n" +
                        "There is no need to recapitulate what I did before going to Central Africa.\n" +
                        "\n" +
                        "I went up the Nile and saw Mr. Higginbotham, chief engineer in Baker's Expedition, at Philae, and was the means of preventing a duel between him and a mad young Frenchman, who wanted to fight Mr. Higginbotham with pistols, because that gentleman resented the idea of being taken for an Egyptian, through wearing a fez cap. I had a talk with Capt. Warren at Jerusalem, and descended one of the pits with a sergeant of engineers to see the marks of the Tyrian workmen on the foundation-stones of the Temple of Solomon. I visited the mosques of Stamboul with the Minister Resident of the United States, and the American Consul-General. I travelled over the Crimean battle-grounds with Kinglake's glorious books for reference in my hand. I dined with the widow of General Liprandi at Odessa. I saw the Arabian traveller Palgrave at Trebizond, and Baron Nicolay, the Civil Governor of the Caucasus, at Tiflis. I lived with the Russian Ambassador while at Teheran, and wherever I went through Persia I received the most hospitable welcome from the gentlemen of the Indo-European Telegraph Company; and following the examples of many illustrious men, I wrote my name upon one of the Persepolitan monuments. In the month of August, 1870, I arrived in India.\n" +
                        "\n" +
                        "On the 12th of October I sailed on the barque 'Polly' from Bombay to Mauritius. As the 'Polly' was a slow sailer, the passage lasted thirty-seven days. On board this barque was a William Lawrence Farquhar—hailing from Leith, Scotland—in the capacity of first-mate. He was an excellent navigator, and thinking he might be useful to me, I employed him; his pay to begin from the date we should leave Zanzibar for Bagamoyo. As there was no opportunity of getting, to Zanzibar direct, I took ship to Seychelles. Three or four days after arriving at Mahe, one of the Seychelles group, I was fortunate enough to get a passage for myself, William Lawrence Farquhar, and an Arab boy from Jerusalem, who was to act as interpreter—on board an American whaling vessel, bound for Zanzibar; at which port we arrived on the 6th of January, 1871.\n" +
                        "\n" +
                        "I have skimmed over my travels thus far, because these do not concern the reader. They led over many lands, but this book is only a narrative of my search after Livingstone, the great African traveller. It is an Icarian flight of journalism, I confess; some even have called it Quixotic; but this is a word I can now refute, as will be seen before the reader arrives at the \"Finis.\"\n" +
                        "\n" +
                        "I have used the word \"soldiers\" in this book. The armed escort a traveller engages to accompany him into East Africa is composed of free black men, natives of Zanzibar, or freed slaves from the interior, who call themselves \"askari,\" an Indian name which, translated, means \"soldiers.\" They are armed and equipped like soldiers, though they engage themselves also as servants; but it would be more pretentious in me to call them servants, than to use the word \"soldiers;\" and as I have been more in the habit of calling them soldiers than \"my watuma\"—servants—this habit has proved too much to be overcome. I have therefore allowed the word \"soldiers\" to appear, accompanied, however, with this apology.\n" +
                        "\n" +
                        "But it must be remembered that I am writing a narrative of my own adventures and travels, and that until I meet Livingstone, I presume the greatest interest is attached to myself, my marches, my troubles, my thoughts, and my impressions. Yet though I may sometimes write, \"my expedition,\" or \"my caravan,\" it by no means follows that I arrogate to myself this right. For it must be distinctly understood that it is the \"'New York Herald' Expedition,\" and that I am only charged with its command by Mr. James Gordon Bennett, the proprietor of the 'New York Herald,' as a salaried employ of that gentleman.\n" +
                        "\n" +
                        "One thing more; I have adopted the narrative form of relating the story of the search, on account of the greater interest it appears to possess over the diary form, and I think that in this manner I avoid the great fault of repetition for which some travellers have been severely criticised."
            )
        )
    }
}