package kr.tjeit.lifecycle_20200416

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this;

    abstract fun setupEvents()
    abstract fun setValues()

}