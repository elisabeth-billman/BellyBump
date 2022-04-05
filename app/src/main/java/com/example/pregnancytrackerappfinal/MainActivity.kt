package com.example.pregnancytrackerappfinal

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate
import java.time.temporal.ChronoUnit


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    //this function is connected to the enter button and will print the functions when pressed
    fun onTap(view: View) {

        val weeks = numberOfWeeks()
        //val sizeOfBaby = size(weeks)


        val weeksof: TextView = findViewById(R.id.workingsTV)
        weeksof.text = "Week $weeks"

        val fact: TextView = findViewById(R.id.workingsTV2)
        fact.text = facts(weeks)

        val size: TextView = findViewById(R.id.workingsTV3)
        size.text = "Your baby is the size of a " + size(weeks)

    }

    //this function calculates the number of weeks pregnant a woman is based on todays date and her due date
    private fun numberOfWeeks(): Long {


        //use today's date as the start date by using the imported java.time.LocalDate Library
        val start = LocalDate.of(2022, 4, 5)
        //use the due date as the end date
        val end = LocalDate.of(2022, 5, 22)
        //this function takes the start date and the end date and finds the number of days inbetween
        val days = ChronoUnit.DAYS.between(start, end)


        //make a variable to hold the number of days a full term pregnancy is. 40 weeks, 280 days
        val fullTerm = Integer.valueOf(280)
        //find the difference between the number of days of a full week pregnancy and the days of the pregnancy
        val difference = fullTerm.minus(days)

        val numWeeks = difference.div(7)
        return numWeeks as Long


    }


    // write a function that will display a weekly fact depending on the number of weeks
    private fun facts(weeks: Long): String {

        var weeklyFact = ""
        if (weeks == 5L){
            weeklyFact = "Your little one now has a two-chamber heart, and the heart starts beating"}
        else if (weeks == 6L){
            weeklyFact = "Your baby’s eyelids are starting to form, and the brain is developing fast"}
        else if (weeks == 7L){
            weeklyFact = "Tiny paddle structures are starting to form which will become hands and feet, the eye color is starting to form"}
        else if (weeks == 8L){
            weeklyFact = "The heart is now fully developed into four chambers and sex organs are starting to form"}
        else if (weeks == 9L){
            weeklyFact = "The fingers and toes become properly separated and lose any webbing, joints are starting to form, and the eyes are moving from the side of the head to the front"}
        else if (weeks == 10L){
            weeklyFact = "Fingernails are formed, and the placenta will start to function"}
        else if (weeks == 11L){
            weeklyFact = "Your baby is now able to bend, stretch, kick, and even make faces"}
        else if (weeks == 12L){
            weeklyFact = "Your baby’s lungs are practicing breathing with amniotic fluid"}
        else if (weeks == 13L){
            weeklyFact = "Your baby’s arms are now proportionate to their body, but their legs are a bit shorter"}
        else if (weeks == 14L){
            weeklyFact = "Your baby can now rub its eyes, yawn, and blink"}
        else if (weeks == 15L){
            weeklyFact = "Arms and legs are completely formed"}
        else if (weeks == 16L){
            weeklyFact = "The meconium (the first bowel movement your baby will have after birth) is starting to form in your baby’s bowel"}
        else if (weeks == 17L){
            weeklyFact = "Your baby’s hearing is now developed so it can hear noises outside the womb more clearly"}
        else if (weeks == 18L){
            weeklyFact = "Your baby is now covered with vernix"}
        else if (weeks == 19L){
            weeklyFact = "At this point your baby is developing a more regular sleep pattern and you may become more aware of them"}
        else if (weeks == 20L){
            weeklyFact = "Your baby’s gender can now be identified on an ultrasound"}
        else if (weeks == 21L){
            weeklyFact = "The eyelashes and eyebrows are now formed"}
        else if (weeks == 22L){
            weeklyFact = "Your baby is starting to look cuter and more like how he or she will look at birth."}
        else if (weeks == 23L){
            weeklyFact = "Your baby’s hair is changing to the color it will have at birth"}
        else if (weeks == 24L){
            weeklyFact = "The nostrils are beginning to open"}
        else if (weeks == 25L){
            weeklyFact = "Music and voices will leave an impression in your baby’s brain."}
        else if (weeks == 26L){
            weeklyFact = "Your baby will start practicing the sucking reflex."}
        else if (weeks == 27L){
            weeklyFact = " You baby is able to recognize different levels of light."}
        else if (weeks == 28L){
            weeklyFact = "All the internal organs are maturing and preparing to function on their own at birth."}
        else if (weeks == 29L){
            weeklyFact = "Your baby is now able to see even though it is dark."}
        else if (weeks == 30L){
            weeklyFact = "Your baby is practicing breathing most of the time."}
        else if (weeks == 31L){
            weeklyFact = "Your baby can now use all five senses and is busy looking around."}
        else if (weeks == 32L){
            weeklyFact = "Your baby can now tell the difference between day and night"}
        else if (weeks == 33L){
            weeklyFact = "From now until birth your baby will gain approximately half a pound per week."}
        else if (weeks == 34L){
            weeklyFact = "From now until birth your baby will gain approximately half a pound per week."}
        else if (weeks == 35L){
            weeklyFact = "Your baby’s gums have ridges that look a bit like teeth."}
        else if (weeks == 36L){
            weeklyFact = "Lungs are fully developed, which means your baby would be able to breathe on its own if born now"}
        else if (weeks == 37L){
            weeklyFact = "Your baby’s fingernails continue to grow but remain soft"}
        else if (weeks == 38L){
            weeklyFact = "Your baby is continuing to build-up fat under the skin"}
        else if (weeks == 39L){
            weeklyFact = "Your baby has 300 bones, an adult has only 206"}
        else if (weeks == 40L){
            weeklyFact = "Your pregnancy is full term"}

        return weeklyFact
    }

    //write a function that will display the size depending on the number of weeks
    private fun size(weeks: Long): String {

        var fruitSize = ""

        if ( weeks == 5L){
            fruitSize = "Sesame seed"}
        else if ( weeks == 6L){
            fruitSize = "Lentil"}
        else if ( weeks == 7L){
            fruitSize = "Blueberry"}
        else if ( weeks == 8L){
            fruitSize = "Kidney Bean"}
        else if ( weeks == 9L){
            fruitSize = "Grape"}
        else if ( weeks == 10L){
            fruitSize = "Kumquat"}
        else if ( weeks == 11L){
            fruitSize = "Fig"}
        else if ( weeks == 12L){
            fruitSize = "Lime"}
        else if ( weeks == 13L){
            fruitSize = "Pea-pod"}
        else if ( weeks == 14L){
            fruitSize = "Lemon"}
        else if ( weeks == 15L){
            fruitSize = "Apple"}
        else if ( weeks == 16L){
            fruitSize = "Avocado"}
        else if ( weeks == 17L){
            fruitSize = "Turnip"}
        else if ( weeks == 18L){
            fruitSize = "Bell Pepper"}
        else if ( weeks == 19L){
            fruitSize = "Tomato"}
        else if ( weeks == 20L){
            fruitSize = "Banana"}
        else if ( weeks == 21L){
            fruitSize = "Carrot"}
        else if ( weeks == 22L){
            fruitSize = "Spaghetti Squash"}
        else if ( weeks == 23L){
            fruitSize = "Large Mango"}
        else if ( weeks == 24L){
            fruitSize = "Ear of Corn"}
        else if ( weeks == 25L){
            fruitSize = "Rutabaga"}
        else if ( weeks == 26L){
            fruitSize = "Scallion"}
        else if ( weeks == 27L){
            fruitSize = "Head of Cauliflower"}
        else if ( weeks == 28L){
            fruitSize = "Eggplant"}
        else if ( weeks == 29L){
            fruitSize = "Butternut Squash"}
        else if ( weeks == 30L){
            fruitSize = "Cabbage"}
        else if ( weeks == 31L){
            fruitSize = "Coconut"}
        else if ( weeks == 32L){
            fruitSize = "Jicama"}
        else if ( weeks == 33L){
            fruitSize = "Pineapple"}
        else if ( weeks == 34L){
            fruitSize = "Cantaloupe"}
        else if ( weeks == 35L){
            fruitSize = "Honeydew Melon"}
        else if ( weeks == 36L){
            fruitSize = "Romaine Lettuce"}
        else if ( weeks == 37L){
            fruitSize = "Swiss Chard"}
        else if ( weeks == 38L){
            fruitSize = "Leek"}
        else if ( weeks == 39L){
            fruitSize = "Watermelon"}
        else if ( weeks == 40L){
            fruitSize = ""}

        return fruitSize

    }
}













