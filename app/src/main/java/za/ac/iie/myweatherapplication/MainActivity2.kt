package za.ac.iie.myweatherapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    val day =
        arrayOf("Monday", "Tuesday", "wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val temp =
        arrayOf("15", "20", "36", "23", "25", "32", "28",)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val weatherTextView = findViewById<TextView>(R.id.weatherTextView) // The code used here is to set up the arrays in order one after each other
        var weatherDisplay = ""
        weatherDisplay += "${day[0]}\n"
        weatherDisplay += "${day[1]}\n}"
        weatherDisplay += "${day[2]}\n"
        weatherDisplay += "${day[3]}\n"
        weatherDisplay += "${day[4]}\n"
        weatherDisplay += "${day[5]}\n"
        weatherDisplay += "${day[6]}\n"

        weatherTextView.text = weatherDisplay


        val tempTextView = findViewById<TextView>(R.id.tempTextView)
        var tempDisplay = ""
        tempDisplay += "${temp[0]}\n"
        tempDisplay += "${temp[1]}\n}"
        tempDisplay += "${temp[2]}\n"
        tempDisplay += "${temp[3]}\n"
        tempDisplay += "${temp[4]}\n"
        tempDisplay += "${temp[5]}\n"
        tempDisplay += "${temp[6]}\n"

        tempTextView.text = tempDisplay


        val textView3 = findViewById<TextView>(R.id.textView3)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val textView4 = findViewById<TextView>(R.id.textView4)


        val btn4 = findViewById<Button>(R.id.btn4) //This button will help calculate the average
        btn4.setOnClickListener {
            val temp = tempTextView.text.toString().toDouble()
            val avg = tempTextView // (/6 ;)  //This is the code that will help me calculate the average temperature of he week

            textView3.text = "Average : $avg"


        }


        val btn3 = findViewById<Button>(R.id.btn3)//This button will allow the user to exit the app
        btn3.setOnClickListener {
            finish()


            val btn2 =
                findViewById<Button>(R.id.btn2) //This button will be used to hel navigate to the next screen
            btn2.setOnClickListener {
                val Intent = Intent(this, MainActivity3::class.java)
            }
        }
    }
}



























