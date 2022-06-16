package jp.techacademy.yuki.sakamaki.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tashizan.setOnClickListener(this)
        hikizan.setOnClickListener(this)
        kakezan.setOnClickListener(this)
        warizan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val atai1 = editText1.text.toString()
        val atai2 = editText2.text.toString()
        if(atai1 == null){

        }

        if (v.id == R.id.tashizan) {
            val tashizantashizan = Intent(this, SecondActivity::class.java)
            tashizantashizan.putExtra("Val1", atai1)
            tashizantashizan.putExtra("val2", atai2)
            tashizantashizan.putExtra("val3","tasu")
            if(atai1 == "" || atai2 == ""){
                tashizantashizan.putExtra("val3","naiyo")
            }
            startActivity(tashizantashizan)
        } else if (v.id == R.id.hikizan) {
            val hikizanhikizan = Intent(this, SecondActivity::class.java)
            hikizanhikizan.putExtra("Val1", atai1)
            hikizanhikizan.putExtra("val2", atai2)
            hikizanhikizan.putExtra("val3", "hiku")
            if(atai1 == "" || atai2 == ""){
                hikizanhikizan.putExtra("val3","naiyo")
            }
            startActivity(hikizanhikizan)
        } else if (v.id == R.id.kakezan) {
            val kakezankakezan = Intent(this, SecondActivity::class.java)
            kakezankakezan.putExtra("Val1", atai1)
            kakezankakezan.putExtra("val2", atai2)
            kakezankakezan.putExtra("val3", "kakeru")
            if(atai1  == "" || atai2 == ""){
                kakezankakezan.putExtra("val3","naiyo")
            }
            startActivity(kakezankakezan)
        } else if (v.id == R.id.warizan) {
            val warizanwarizan = Intent(this, SecondActivity::class.java)
            warizanwarizan.putExtra("Val1", atai1)
            warizanwarizan.putExtra("val2", atai2)
            warizanwarizan.putExtra("val3", "waru")
            if(atai1 == "" || atai2 == ""){
                warizanwarizan.putExtra("val3","naiyo")
            }
            startActivity(warizanwarizan)
        }
    }
}