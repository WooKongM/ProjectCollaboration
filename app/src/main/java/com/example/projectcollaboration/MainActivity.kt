package com.example.projectcollaboration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectcollaboration.Board.BoardFragment
import com.example.projectcollaboration.Chatting.ChattingFragment
import com.example.projectcollaboration.Project.ProjectFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bnv_main = findViewById(R.id.bnv_main) as BottomNavigationView

        bnv_main.run { setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.first -> {
                    // 다른 프래그먼트 화면으로 이동하는 기능
                    val boardFragment = BoardFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, boardFragment).commit()
                }
                R.id.second -> {
                    val projectFragment = ProjectFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, projectFragment).commit()
                }
                R.id.third -> {
                    val chattingFragment = ChattingFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, chattingFragment).commit()
                }
            }
            true
        }
            selectedItemId = R.id.second
        }
    }
}

