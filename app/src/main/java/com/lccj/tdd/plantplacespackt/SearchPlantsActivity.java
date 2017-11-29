package com.lccj.tdd.plantplacespackt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.lccj.tdd.R;
import com.lccj.tdd.service.IPlantService;
import com.lccj.tdd.service.PlantService;

public class SearchPlantsActivity extends AppCompatActivity {

  IPlantService iPlantService;
  private AutoCompleteTextView actPlantName;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_searchPlants);
    iPlantService = new PlantService();
    actPlantName = (AutoCompleteTextView) findViewById(R.id.actPlantName);

  }

  public void searchPlants(View view){

    iPlantService.fetchPlants(actPlantName.getText().toString());

  }
}
