package com.izzzya.storybookapp.adapter

import com.izzzya.storybookapp.R

data class Book(
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
            ),
            Book(
                "Чек пук паутина",
                "izzzya_1917",
                "ФЕТИШ ФАНФИК.....ГДЕ МИГЕЛЬ....ПОЕЛ ГОРОХ...",
                R.drawable.spideman,
                listOf("пауки"),
                "Возвращается Мигель О'Хара с работы а там его встречает его жена Лего паук\n" +
                        "- что у нас сегодня на ужин дорога?\n" +
                        "- гороховый суп - донёсся тонкий голосок с пола\n" +
                        "- м-м-м, мой любимый... - протянул Мигель закусывая губу, - а ты умеешь порадовать"+
                        "\nОни сели вдвоем за стол, Лего паук зажёг чайные свечи спичкой, потому что это было самое романтичное, до чего доставал его рост\n" +
                        "Мигель О'Хара облизнулся, глядя на таз горохового супа перед ним. \n" +
                        "- приятного аппетита, - вновь произнёс Лего паук, беря в руки кошельковую ложечку..."
                +"\nПосле плотного ужина обеда, по закону Архимеда, чтобы жиром не заплыть, надо срочно покурить полежать - подумал Лего паук, спрыгнул со своего детского стульчика с лесенкой с помощью Лего паутины, и попрыгал в сторону кровати супругов. \n" +
                        "Лего паук залез в постель и сложил свои ножки в расслабленную и слегка эротичную позу настолько, насколько мог\n" +
                        "Он был ещё одет, но точно не в глазах Мигеля..."
                +"\nМигель, поглотив таз горохового супа словно черная дыра, так заботливо приготовленного его мужем, заметил это, и вслед пошел к кровати.\n" +
                        "Он заметил, в каком положении духа и тела располагается Лего паук. Его намерения были ясны с самого начала. \n" +
                        "Мигель потянулся над кроватью и резко упал на неё своей попой объёмом в кубический километр...\n" +
                        "- Ой, - он обернулся, - милый, я не задел тебя?\n" +
                        "В ответ ничего не поступило, лишь лёгкие вибрации пощекотали его ягодицу.\n" +
                        "- Что ж, молчание — знак согласия, - тихо произнес своим низким голосом Мигель и подвигал бёдрами, устраиваясь удобнее."
                +"\nЧерез пару мгновений Мигель почувствовал что-то знакомое в своём кишечнике. Он сразу же подумал, насколько неловко будет запускать газовую атаку, когда любовник лежит так близко, поэтому решил сделать всё тихо. \n" +
                        "\n" +
                        "Пук.... пук-пук...\n" +
                        "\n" +
                        "Мигель запустил шептуна."
                +"\nПаук '99 был осторожен: прислушивался, не возникнет ли возражений от Лего. Но была тишина. \n" +
                        "Тогда он решил пойти ва-банк. Выпустить всё, быстро и сразу. \n" +
                        "\n" +
                        "- ПУУУУУУУУУУУК\uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8\n" +
                        "\n" +
                        "Пердёж резонировал по квартире, заставляя содрогаться пружины матраса и маленького Лего паука, ловящего собачий кайф от перекрытого жопой Мигеля ему воздуха."
                +"\nЛего паук на какой-то момент почувствовал себя евреем. Но от оргазма ещё никто не умирал, даже находясь в газовой камере. \n" +
                        "Суп удался поистине великолепным: его хватило на всю ночь. \n" +
                        "Лишь пара белых Лего кубиков на ягодице Мигеля напоминали о том, что произошло между ними тем вечером..."
            ),
            Book(
                "Interview with the Vampire (The Vampire Chronicles 1)",
                "Anne Rice",
                "This is the story of Louis, as told in his own words, of his journey through mortal and immortal life. Louis recounts how he became a vampire at the hands of the radiant and sinister Lestat and how he became indoctrinated, unwillingly, into the vampire way of life. His story ebbs and flows through the streets of New Orleans, defining crucial moments such as his discovery of the exquisite lost young child Claudia, wanting not to hurt but to comfort her with the last breaths of humanity he has inside. Yet, he makes Claudia a vampire, trapping her womanly passion, will, and intelligence inside the body of a small child. Louis and Claudia form a seemingly unbreakable alliance and even \"settle down\" for a while in the opulent French Quarter. Louis remembers Claudia's struggle to understand herself and the hatred they both have for Lestat that sends them halfway across the world to seek others of their kind. Louis and Claudia are desperate to find somewhere they belong, to find others who understand, and someone who knows what and why they are.\n" +
                        "\n" +
                        "Louis and Claudia travel Europe, eventually coming to Paris and the ragingly successful Theatre des Vampires--a theatre of vampires pretending to be mortals pretending to be vampires. Here they meet the magnetic and ethereal Armand, who brings them into a whole society of vampires. But Louis and Claudia find that finding others like themselves provides no easy answers and in fact presents dangers they scarcely imagined.\n" +
                        "\n" +
                        "Originally begun as a short story, the book took off as Anne wrote it, spinning the tragic and triumphant life experiences of a soul. As well as the struggles of its characters, Interview captures the political and social changes of two continents. The novel also introduces Lestat, Anne's most enduring character, a heady mixture of attraction and revulsion. The book, full of lush description, centers on the themes of immortality, change, loss, sexuality, and power.",
                R.drawable.vamps,
                listOf("Vampires", "Classics"),
                "PART I\n" +
                        "“I see…” said the vampire thoughtfully, and slowly he walked across the room towards the window. For a long time he stood there against the dim light from Divisadero Street and the passing beams of traffic. The boy could see the furnishings of the room more clearly now, the round oak table, the chairs. A wash basin hung on one wall with a mirror. He set his brief case on the table and waited.\n" +
                        "“But how much tape do you have with you?” asked the vampire, turning now so the boy could see his profile. “Enough for the story of a life?”\n" +
                        "“Sure, if it’s a good life. Sometimes I interview as many as three or four people a night if I’m lucky. But it has to be a good story. That’s only fair, isn’t it?”"+
                "\n“Admirably fair,” the vampire answered. “I would like to tell you the story of my life, then. I would like to do that very much.”\n" +
                        "“Great,” said the boy. And quickly he removed the small tape recorder from his brief case, making a check of the cassette and the batteries. “I’m really anxious to hear why you believe this, why you…”\n" +
                        "“No,” said the vampire abruptly. “We can’t begin that way. Is your equipment ready?”\n" +
                        "“Yes,” said the boy.\n" +
                        "“Then sit down. I’m going to turn on the overhead light.”\n" +
                        "“But I thought vampires didn’t like light,” said the boy. “If you think the dark adds to the atmosphere.”\n" +
                        "But then he stopped. The vampire was watching him with his back to the window. The boy could make out nothing of his face now, and something about the still figure there distracted him. He started to say something again but he said nothing. And then he sighed with relief when the vampire moved towards the table and reached for the overhead cord.\n" +
                        "At once the room was flooded with a harsh yellow light. And the boy, staring up at the vampire, could not repress a gasp. His fingers danced backwards on the table to grasp the edge. “Dear God!” he whispered, and then he gazed, speechless, at the vampire.\n" +
                        "The vampire was utterly white and smooth, as if he were sculpted from bleached bone, and his face was as seemingly inanimate as a statue, except for two brilliant green eyes that looked down at the boy intently like flames in a skull. But then the vampire smiled almost wistfully, and the smooth white substance of his face moved with the infinitely flexible but minimal lines of a cartoon. “Do you see?” he asked softly.\n" +
                        "The boy shuddered, lifting his hand as if to shield himself from a powerful light. His eyes moved slowly over the finely tailored black coat he’d only glimpsed in the bar, the long folds of the cape, the black silk tie knotted at the throat, and the gleam of the white collar that was as white as the vampire’s flesh. He stared at the vampire’s full black hair, the waves that were combed back over the tips of the ears, the curls that barely touched the edge of the white collar.\n" +
                        "“Now, do you still want the interview?” the vampire asked.\n" +
                        "The boy’s mouth was open before the sound came out. He was nodding. Then he said, “Yes.”\n" +
                        "The vampire sat down slowly opposite him and, leaning forward, said gently, confidentially, “Don’t be afraid. Just start the tape.”\n" +
                        "And then he reached out over the length of the table. The boy recoiled, sweat running down the sides of his face. The vampire clamped a hand on the boy’s shoulder and said, “Believe me, I won’t hurt you. I want this opportunity. It’s more important to me than you can realize now. I want you to begin.” And he withdrew his hand and sat collected, waiting.\n" +
                        "It took a moment for the boy to wipe his forehead and his lips with a handkerchief, to stammer that the microphone was in the machine, to press the button, to say that the machine was on.\n" +
                        "“You weren’t always a vampire, were you?” he began.\n" +
                        "“No,” answered the vampire. “I was a twenty-five year-old man when I became a vampire, and the year was seventeen ninety-one.”\n" +
                        "The boy was startled by the preciseness of the date and he repeated it before he asked, “How did it come about?”\n" +
                        "“There’s a simple answer to that. I don’t believe I want to give simple answers,” said the vampire. “I think I want to tell the real story…”\n" +
                        "“Yes,” the boy said quickly. He was folding his handkerchief over and over and wiping his lips now with it again."
            )
        )
    }
}