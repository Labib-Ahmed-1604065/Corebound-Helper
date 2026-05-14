package ahmed.labib.coreboundhelper

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Spinner
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Spinner for Dropdown Box containing map names
        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter.createFromResource(this, R.array.maps, android.R.layout.simple_spinner_dropdown_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=adapter

        //Spinner selection handler with buttons
        val linearLayoutScrollView = findViewById<LinearLayout>(R.id.linearLayoutScrollView)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>, //Spinner
                view: View, //selected item view
                position: Int, //index of selected item
                id: Long, //row id of selected item
            ) {
                val selectedFromSpinner = parent.getItemAtPosition(position).toString()

                linearLayoutScrollView.removeAllViews()
                //this is important, removes previous views

                //dynamic selection of maps from spinner
                val descriptionsSelectedMap: List<Description> =
                when(selectedFromSpinner) {
                    "The Lost Scrapyard" -> descriptionsLostScrapyard
                    "Crystal Quarry" -> descriptionsCrystalQuarry
                    "Beacon City" -> descriptionsBeaconCity
                    "Desolate Drains" -> descriptionsDesolateDrains
                    "Icy Hollow" -> descriptionsIcyHollow
                    "Kinetic Workshop" -> descriptionsKineticWorkshop
                    else -> descriptionsLostScrapyard
                }

                for (enemy in descriptionsSelectedMap) {
                    val button = Button(this@MainActivity)
                    button.text = enemy.name
                    button.id = enemy.id
                    val buttonParams = LinearLayout.LayoutParams (
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        )
                    buttonParams.setMargins(16, 8, 16, 8)
                    button.layoutParams = buttonParams
                    linearLayoutScrollView.addView(button)

                    button.setOnClickListener {
                        val descriptionIntent = Intent(this@MainActivity, DescriptionActivity::class.java)
                        descriptionIntent.putExtra("enemyID", enemy.id)
                        descriptionIntent.putExtra("enemyName", enemy.name)
                        descriptionIntent.putExtra("enemyDescription", enemy.description)
                        descriptionIntent.putExtra("enemyHealth", enemy.attributeHealth)
                        descriptionIntent.putExtra("enemyDamage", enemy.attributeDamage)
                        startActivity(descriptionIntent)
                        }
                }
                /*val button = Button(this@MainActivity)
                button.text = descriptionsLostScrapyard[1].name //selectedFromSpinner
                linearlayout1.addView(button)*/
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
        //Dynamic buttons from description

        //to do: add dropdown for difficulty upgrades
    }
}