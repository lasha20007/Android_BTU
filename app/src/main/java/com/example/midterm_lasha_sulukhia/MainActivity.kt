package com.example.midterm_lasha_sulukhia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun send(view: View){
        val name = findViewById<View>(R.id.firstname) as EditText
        val firstName = name.text.toString()

        val surname = findViewById<View>(R.id.lastname) as EditText
        val lastName = surname.text.toString()

        val review = findViewById<View>(R.id.review) as EditText
        val feedBack = review.text.toString()

        val email = findViewById<View>(R.id.email) as EditText

        val mail = email.text.toString()
        if (firstName.length < 3){
            Toast.makeText(applicationContext, "სახელის სიგრძე 3-ზე ნაკლებია", Toast.LENGTH_SHORT).show()
        }
        else if (lastName.length < 5){
            Toast.makeText(applicationContext, "გვარის სიგრძე 5-ზე ნაკლებია", Toast.LENGTH_SHORT).show()
        }
        else if (mail.isNullOrEmpty() && !Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
            Toast.makeText(applicationContext, "ელ-ფოსთის ფორმატი არასწორია", Toast.LENGTH_SHORT).show()
        }
        else if (feedBack.length < 10){
            Toast.makeText(applicationContext, "უკუკავშირის ტექსტი 10-ზე ნაკლებია", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(applicationContext, "წარმატებით გაიგზავნა", Toast.LENGTH_SHORT).show()
        }

    }
}