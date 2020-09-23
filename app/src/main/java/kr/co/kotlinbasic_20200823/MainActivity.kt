package kr.co.kotlinbasic_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMeBtn.setOnClickListener {
//            클릭 미 버튼이 눌리면 실행될 코드 {  }
            Log.d("메인화면", "클릭 미 버튼 눌림")
        }

        makeLogBtn.setOnClickListener {
            Log.d("메인화면", "로그 남기기 버튼 눌림")
            Log.e("메인화면", "실행되면 안되는 코드에 대한 체크")
        }

        toastBtn.setOnClickListener {
//            사용자에게 "버튼 눌림" 안내 문구 제공
            Toast.makeText(this, "버튼 눌림", Toast.LENGTH_SHORT).show()
        }
    }
}