package ahmed.labib.coreboundhelper

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_description)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //json value form intent
        val enemyID = intent.getIntExtra("enemyID",0)
        val enemyName = intent.getStringExtra("enemyName")?:""
        val enemyDescription = intent.getStringExtra("enemyDescription")?:""
        val enemyHealth = intent.getIntExtra("enemyHealth",0)
        val enemyDamage = intent.getIntExtra("enemyDamage",0)

        //attach xml and kt using R.id
        val main = findViewById<ConstraintLayout>(R.id.main)

        val infoConstraintLayout = findViewById<ConstraintLayout>(R.id.infoConstraintLayout)
        val enemyNameTextView = findViewById<TextView>(R.id.enemyNameTextView)

        val detailsTextView = findViewById<TextView>(R.id.detailsTextView)

        val lootTypeOneConstraintLayout = findViewById<ConstraintLayout>(R.id.lootTypeOneConstraintLayout)
        val lootTypeTwoConstraintLayout = findViewById<ConstraintLayout>(R.id.lootTypeTwoConstraintLayout)


        //write descriptions
        enemyNameTextView.text = enemyName
        val enemyDetailsText =
            "Description\n$enemyDescription\nAttributes\nHealth\t$enemyHealth\nDamage\t$enemyDamage\n"
        detailsTextView.text = enemyDetailsText
        main.removeAllViews()
        infoConstraintLayout.removeAllViews()
        lootTypeOneConstraintLayout.removeAllViews()
        lootTypeTwoConstraintLayout.removeAllViews()
        infoConstraintLayout.addView(enemyNameTextView)
        main.addView(infoConstraintLayout)
        main.addView(detailsTextView)
    }
    //TODO(another mapSpinner to select difficulty)
}