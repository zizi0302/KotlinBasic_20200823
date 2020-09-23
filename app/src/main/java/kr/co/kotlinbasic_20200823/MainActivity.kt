package kr.co.kotlinbasic_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makeLogBtn.setOnClickListener {
            Log.d("메인화면", "로그 남기기 버튼 눌림")
            Log.d("메인화면", "실행되면 안되는 코드에 대한 체크")
        }
    }
}