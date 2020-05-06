package br.com.kely.numerorandomico

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View) {

        //declaração de variavel
        var texto = findViewById<TextView>(R.id.textViewResultadoSorteio)

        //gera numero randomico de 0 a 10
        var numeroSorteado = java.util.Random().nextInt(11)

        //exibe o valor da variavel randomica de 0 a 10
        texto.setText("Número sorteado é: $numeroSorteado ")

    }
}
