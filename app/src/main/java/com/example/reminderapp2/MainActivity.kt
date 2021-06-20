package com.example.reminderapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabPop = findViewById<Button>(R.id.remFab)
        fabPop.setOnClickListener {
            showPopUpMenu()
        }

    }

    private fun showPopUpMenu() {
       //val pMenu = PopupMenu(this , remFab)
        
    }

    val MENU_Login = 1

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val itemExit = menu?.add(0,MENU_Login , 0 ,"Login")
        itemExit?.setIcon(android.R.drawable.ic_menu_send)
        itemExit?.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        when(id){

            MENU_Login->{
                val i = Intent(this , ReminderActivity::class.java)
                startActivity(i)
            }
        }
        return super.onOptionsItemSelected(item)
    }



    fun fabClick(view: View) {

        val i = Intent(this , ReminderActivity::class.java)
        startActivity(i)
    }


}