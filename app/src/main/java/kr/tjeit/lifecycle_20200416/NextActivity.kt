package kr.tjeit.lifecycle_20200416

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NextActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

}
