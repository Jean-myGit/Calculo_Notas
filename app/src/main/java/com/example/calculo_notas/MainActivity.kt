package com.example.calculo_notas

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = ButtonCalcular
        val tvResultado = TextViewResultado

        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(EditTextNota01.text.toString())
            val nota2 = Integer.parseInt(EditTextNota02.text.toString())
            val nota3 = Integer.parseInt(EditTextNota03.text.toString())
            val media = ((nota1 + nota2 + nota3) / 3)
            val faltas = Integer.parseInt(EditTextFaltas.text.toString())

            if (media >= 7 && faltas <= 10) {
                tvResultado.setText("O aluno foi APROVADO!! \nMédia Final: $media \nFaltas Totais: $faltas")
                tvResultado.setTextColor(Color.GREEN)

            } else {
                tvResultado.setText("O aluno Não foi Aprovado. \nMédia Final: $media \nFaltas Totais: $faltas")
                tvResultado.setTextColor(Color.RED)
            }
        }
    }
}

//$"O aluno foi APROVADO! \nMédia Final: {$media} \nFaltas Total: {$faltas}"