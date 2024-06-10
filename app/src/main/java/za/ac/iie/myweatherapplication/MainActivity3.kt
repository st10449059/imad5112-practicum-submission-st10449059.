package za.ac.iie.myweatherapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    val day =
        arrayOf("Monday", "Tuesday", "wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val temp =
        arrayOf("15", "20", "36", "23", "25", "32", "28",)
    val min =
        arrayOf("11", "15","30","16","19","27","21" )
    val max =
        arrayOf("20","25","32","25","26","33","29")
    val conditions =
        arrayOf("cold","sunny","hot","sunny","hot","sunny")

    // Here above i am declaring the string value of each array


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val dayTextView = findViewById<TextView>(R.id.dayTextView) // The code used here is to set up the arrays in order one after each other
        var dayDisplay = ""
        dayDisplay += "${day[0]}\n"
        dayDisplay += "${day[1]}\n}"
        dayDisplay += "${day[2]}\n"
        dayDisplay += "${day[3]}\n"
        dayDisplay += "${day[4]}\n"
        dayDisplay += "${day[5]}\n"
        dayDisplay += "${day[6]}\n"

        dayTextView.text = dayDisplay

        val minTextView = findViewById<TextView>(R.id.minTextView)
        var minDisplay = ""
        minDisplay += "${min[1]}\n}"
        minDisplay += "${min[2]}\n"
        minDisplay += "${min[3]}\n"
        minDisplay += "${min[4]}\n"
        minDisplay += "${min[5]}\n"
        minDisplay += "${min[6]}\n"

        minTextView.text = minDisplay


        val maxTextView = findViewById<TextView>(R.id.maxTextView)
        var maxDisplay = ""
        maxDisplay += "${max[1]}\n}"
        maxDisplay += "${max[2]}\n"
        maxDisplay += "${max[3]}\n"
        maxDisplay += "${max[4]}\n"
        maxDisplay += "${max[5]}\n"
        maxDisplay += "${max[6]}\n"

        maxTextView.text = maxDisplay


        val conditionsTextView = findViewById<TextView>(R.id.conditionsTextView)
        var conditionsDisplay = ""
        conditionsDisplay += "${conditions[1]}\n}"
        conditionsDisplay += "${conditions[2]}\n"
        conditionsDisplay += "${conditions[3]}\n"
        conditionsDisplay += "${conditions[4]}\n"
        conditionsDisplay += "${conditions[5]}\n"
        conditionsDisplay += "${conditions[6]}\n"

        conditionsTextView.text = conditionsDisplay

        val btn5 = findViewById<Button>(R.id.btn5) // this button is used to navigate back to the main screen
        btn5.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)

        }


    }
}

