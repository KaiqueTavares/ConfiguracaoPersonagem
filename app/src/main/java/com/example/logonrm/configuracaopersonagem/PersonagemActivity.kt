package com.example.logonrm.configuracaopersonagem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.AdapterView
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_personagem.*

class PersonagemActivity : AppCompatActivity() {

    /**/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personagem)

        //PEGADINHA QUANDO TIVER SET NA FRENTE DE UM METODO
        //NAO USAMOS IGUAL (=) NO EXEMPLO ABAIXO
        sbForca.setOnSeekBarChangeListener (object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                //Como o progress é um inteiro,eu tenho que converter para o string
               tvForca.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        //Quandoeu selecionar o
        spClasses.onItemSelectedListener = (object :
                AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //Aqui estou setando uma variavel aonde estou chamando meu file de Kotlin
                //Chamando o metodo From e passando uma position que ele necessita

                //ESTOU SETANDO MEU OBJETO
                val tipoPersonagem = TipoPersonagemEnum.from(position)

                //When =  Switch
                //Quando meu tipo personagem (Que remete ao meu position)

                when (tipoPersonagem){
                    //Chamo meu ENUM e chamo uma função.
                    TipoPersonagemEnum.ANAO ->trocarImagem(R.drawable.anao)
                    TipoPersonagemEnum.GUERREIRO -> trocarImagem(R.drawable.guerreiro)
                    TipoPersonagemEnum.ELFO -> trocarImagem(R.drawable.elfo)
                    TipoPersonagemEnum.MAGO -> trocarImagem(R.drawable.mago)
                    TipoPersonagemEnum.ORC -> trocarImagem(R.drawable.orc)

                }
            }
        })
    }

    //Criando uma função para trocar a imagem aonde recebe um parametro int
    fun trocarImagem(idImagem: Int){
        //Irei até minha image view e setarei minha imagem
        ivClasse.setImageDrawable(ContextCompat.getDrawable(
                this,idImagem
        ))
    }
}

