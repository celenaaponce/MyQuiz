package com.example.myquizapp

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Angola", "Armenia",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Austria", "Australia",
            "Angola", "Armenia",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Brazil", "Belize",
            "Belgium", "Bermuda",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Burma", "Bahamas",
            "Barbados", "Brazil",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominican Republic", "Denmark",
            "Dominica", "Djibouti",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Finland",
            "France", "French Guinea",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Greece", "Ghana",
            "Germany", "Georgia",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Indonesia", "Iceland",
            "Ireland", "India",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Kazakhstan",
            "Kenya", "Korea",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand", "Norway",
            "Nepal", "Nicaragua",
            1
        )
        questionList.add(que10)
        return questionList
    }
}