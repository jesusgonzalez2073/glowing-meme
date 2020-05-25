package com.gonzalez.jesus.calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso: EditText = findViewById(R.id.weight) as EditText
        val altura: EditText = findViewById(R.id.height) as EditText
        val calcular: Button = findViewById(R.id.calcualte) as Button
        val imc: TextView = findViewById(R.id.imc) as TextView
        val range: TextView = findViewById(R.id.range) as TextView

        //ims= peso/(altura) al cuadrado
        calcular.setOnClickListener(){

            var p: Float = peso.text.toString().toFloat()
            var a: Float = altura.text.toString().toFloat()
            var imc2: Float = p/(a*a)

            imc.setText(""+imc2+"")

            if (imc2 < 18.5){
                range.setText("Debajo del peso")

            }else if (imc2 >= 18.5 && imc2 <= 24.9){
                range.setText("Saludable")

            }else if (imc2 >= 25 && imc2 <= 29.9){
                range.setText("Sobrepeso")

            }else if (imc2 >= 30 && imc2 <= 39.9){
                range.setText("Obesidad")

            }else if (imc2 >= 40){
                range.setText("Mórbida")

            }
        }
    }
}
