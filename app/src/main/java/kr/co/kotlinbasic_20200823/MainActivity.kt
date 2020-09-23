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

//        입력한 문구를 받아서 => 토스트로 출력
        contentToastBtn.setOnClickListener {
//            contentEdt의 문구 (text 속성의 값) => (String으로) 받아서 코틀린 변수에 저장
            val inputContent = contentEdt.text.toString()

//        변수에 저장된 문구를 => 토스트의 재료로 사용
            Toast.makeText(this, inputContent, Toast.LENGTH_SHORT).show()
            when (inputContent) {
                "안녕하세요" -> {
                    Toast.makeText(this, "인사", Toast.LENGTH_SHORT).show()
                }
                "안녕히 가세요" -> {
                    Toast.makeText(this, "작별 인사", Toast.LENGTH_SHORT).show()
                }
                "맛있게 드세요" -> {
                     Toast.makeText(this, "식사 인사", Toast.LENGTH_SHORT).show()
                }
                else -> {
                     Toast.makeText(this, "그 외의 문장", Toast.LENGTH_SHORT).show()
                }
            }
        }

        changeTextBtn.setOnClickListener {
//            messageEdt에 저장된 문구를 String으로 받아서(출력)

            val inputMessage = messageEdt.text.toString()

//            resultTxt의 문구 (text속성의 값)로 반영 (set)

            resultTxt.text = inputMessage
        }

    }
}