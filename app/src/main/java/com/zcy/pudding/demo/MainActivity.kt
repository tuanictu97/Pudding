package com.zcy.pudding.demo

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TextAppearanceSpan
import android.view.View
import androidx.core.view.isInvisible
import com.zcy.pudding.Pudding
import com.zcy.pudding.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    // 默认形式
    fun click1(view: View) {
        Pudding.create(this)
            .config {
                setTitle("This is Title")
                setText("this is text")
            }
            .show()
    }

    // 设置背景颜色、字体
    fun click2(view: View) {
        Pudding.create(this)
            .config {
                setChocoBackgroundColor(resources.getColor(R.color.colorAccent))
                setTitleTypeface(Typeface.DEFAULT_BOLD)
            }.show()
    }

    // 更改icon
    fun click3(view: View) {
        Pudding.create(this)
            .config {
                setTitle("Choco Title")
                setIcon(R.drawable.ic_event_available_black_24dp)
            }.show()
    }

    // 长说明 文字形式
    fun click4(view: View) {
        Pudding.create(this)
            .config {
                setText(R.string.verbose_text_text)
                setIcon(R.drawable.ic_event_available_black_24dp)
            }.show()
    }

    // 永久显示
    fun click5(view: View) {
        Pudding.create(this)
            .config {
                setTitle("Choco Title")
                enableInfiniteDuration = true
            }.show()
    }

    // loading 形式
    fun click6(view: View) {
        Pudding.create(this)
            .config {
                setTitle("Choco Title")
                setEnableProgress(true)
            }.show()
    }


    // 启动一个Activity ,验证是否存在lack window exception
    fun startAnActivity(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }
}
