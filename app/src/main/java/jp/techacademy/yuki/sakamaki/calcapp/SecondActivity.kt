package jp.techacademy.yuki.sakamaki.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val varvar1 = intent.getStringExtra("Val1")?.toDoubleOrNull()?: 0.0
        val varvar2 = intent.getStringExtra("val2")?.toDoubleOrNull()?: 0.0
        val varvar3 = intent.getStringExtra("val3")

        if(varvar3 == "tasu"){
            textView.text="${varvar1} + ${varvar2} = ${varvar1 + varvar2}"
        }else if(varvar3 == "hiku"){
            textView.text="${varvar1} - ${varvar2} = ${varvar1 - varvar2}"
        }else if(varvar3 == "kakeru"){
            textView.text="${varvar1} × ${varvar2} = ${varvar1 * varvar2}"
        }else if(varvar3 == "waru"){
            textView.text="${varvar1} / ${varvar2} = ${varvar1 / varvar2}"
        }else if(varvar3 == "naiyo"){
            textView.text="数字が入っていませんでした"
        }


    }
}