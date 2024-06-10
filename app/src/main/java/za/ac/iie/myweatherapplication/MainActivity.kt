package za.ac.iie.myweatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)//This button will be used to help navigate to the next screen
        }
        val button2 = findViewById<Button>(R.id.button2) //This button will be used to close the app
        button2.setOnClickListener {
            finish()


        }
    }
}


