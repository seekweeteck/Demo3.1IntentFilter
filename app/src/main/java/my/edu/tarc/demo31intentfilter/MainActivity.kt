package my.edu.tarc.demo31intentfilter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSend.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, editTextMessage.text.toString())
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            intent.type = "text/plain"
            startActivity(intent)
        }
    }

}
