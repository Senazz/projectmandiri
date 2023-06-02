package com.example.projectmandiri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.os.PersistableBundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "   Cook Recipe"
        actionBar.subtitle = "    Berkarya dengan Resep Kuliner"
        actionBar.setIcon(R.drawable.ic_back_light)
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.share -> Toast.makeText(this, "Share Clicked", Toast.LENGTH_SHORT).show()
            R.id.refresh -> Toast.makeText(this, "Refresh Clicked", Toast.LENGTH_SHORT).show()
            R.id.action_bookmark -> Toast.makeText(this, "Bookmark Clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}