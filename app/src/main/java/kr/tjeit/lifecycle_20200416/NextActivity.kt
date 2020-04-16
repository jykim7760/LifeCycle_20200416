package kr.tjeit.lifecycle_20200416

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NextActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        setupEvents()
        setValues()

         Log.d("NextActivity","onResume실행")
    }

    override fun setupEvents() {

        super.onResume()
        Log.d("NextActivity","onResume실행")

    }




    override fun setValues() {

    }

}
