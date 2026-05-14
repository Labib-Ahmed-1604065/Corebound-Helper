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

        //Spinner for difficulty boosters that will change maps
        val difficultySpinner = findViewById<Spinner>(R.id.difficultySpinner)
        val difficultyAdapter = ArrayAdapter.createFromResource(this, R.array.boosts, android.R.layout.simple_spinner_dropdown_item)
        difficultyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        difficultySpinner.adapter = difficultyAdapter

        //Difficulty booster selection handler
        difficultySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>, //Difficulty Spinner
                view: View, //selected item by user view
                position: Int, //index of the selected item
                id: Long, //row id of the selected item
            ) {
                //takes difficulty spinner selection and gives maps written in strings.xml
                val selectedFromDifficultySpinner = parent.getItemAtPosition(position).toString()
                val mapsToBeShown = when(selectedFromDifficultySpinner) {
                    "Scrap" -> R.array.scrap
                    "Tarnished" -> R.array.tarnished
                    "Pure" -> R.array.pure
                    "Toxic" -> R.array.toxic
                    "Frozen" -> R.array.frozen
                    "Geared" -> R.array.geared
                    else -> R.array.scrap
                }

                //Spinner for Dropdown Box containing map names
                val mapSpinner = findViewById<Spinner>(R.id.mapSpinner)
                val mapAdapter = ArrayAdapter.createFromResource(this@MainActivity, mapsToBeShown, android.R.layout.simple_spinner_dropdown_item)
                mapAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                mapSpinner.adapter=mapAdapter

                //Spinner selection handler with buttons
                val linearLayoutScrollView = findViewById<LinearLayout>(R.id.linearLayoutScrollView)
                mapSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>, //Spinner
                        view: View, //selected item view
                        position: Int, //index of the selected item
                        id: Long, //row id of the selected item
                    ) {
                        val selectedFromMapSpinner = parent.getItemAtPosition(position).toString()

                        //this is important, removes previous views
                        linearLayoutScrollView.removeAllViews()

                        //dynamic selection of maps from mapSpinner
                        val descriptionsSelectedMap: List<Description> =
                        when(selectedFromDifficultySpinner to selectedFromMapSpinner) {
                            "Scrap" to "The Lost Scrapyard" -> descriptions_DifficultyScrap_MapTheLostScrapyard
                            "Tarnished" to "The Lost Scrapyard" -> descriptions_DifficultyTarnished_MapTheLostScrapyard
                            "Tarnished" to "Crystal Quarry" -> descriptions_DifficultyTarnished_MapCrystalQuarry
                            "Pure" to "The Lost Scrapyard" -> descriptions_DifficultyPure_MapTheLostScrapyard
                            "Pure" to "Crystal Quarry" -> descriptions_DifficultyPure_MapCrystalQuarry
                            "Pure" to "Beacon City" -> descriptions_DifficultyPure_MapBeaconCity
                            "Toxic" to "The Lost Scrapyard" -> descriptions_DifficultyToxic_MapTheLostScrapyard
                            "Toxic" to "Crystal Quarry" -> descriptions_DifficultyToxic_MapCrystalQuarry
                            "Toxic" to "Beacon City" -> descriptions_DifficultyToxic_MapBeaconCity
                            "Toxic" to "Desolate Drains" -> descriptions_DifficultyToxic_MapDesolateDrains
                            "Frozen" to "The Lost Scrapyard" -> descriptions_DifficultyFrozen_MapTheLostScrapyard
                            "Frozen" to "Crystal Quarry" -> descriptions_DifficultyFrozen_MapCrystalQuarry
                            "Frozen" to "Beacon City" -> descriptions_DifficultyFrozen_MapBeaconCity
                            "Frozen" to "Desolate Drains" -> descriptions_DifficultyFrozen_MapDesolateDrains
                            "Frozen" to "Icy Hollow" -> descriptions_DifficultyFrozen_MapIcyHollow
                            "Geared" to "The Lost Scrapyard" -> descriptions_DifficultyGeared_MapTheLostScrapyard
                            "Geared" to "Crystal Quarry" -> descriptions_DifficultyGeared_MapCrystalQuarry
                            "Geared" to "Beacon City" -> descriptions_DifficultyGeared_MapBeaconCity
                            "Geared" to "Desolate Drains" -> descriptions_DifficultyGeared_MapDesolateDrains
                            "Geared" to "Icy Hollow" -> descriptions_DifficultyGeared_MapIcyHollow
                            "Geared" to "Kinetic Workshop" -> descriptions_DifficultyGeared_MapKineticWorkshop
                            else -> descriptions_DifficultyScrap_MapTheLostScrapyard
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

                    override fun onNothingSelected(parent: AdapterView<*>) {}
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }
    }
}