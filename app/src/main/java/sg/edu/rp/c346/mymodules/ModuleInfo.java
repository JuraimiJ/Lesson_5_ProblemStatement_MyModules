package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleInfo extends AppCompatActivity {

    TextView tvCode;
    TextView tvModName;
    TextView tvAcadYear;
    TextView tvSem;
    TextView tvModCred;
    TextView tvVenue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_info);

        tvCode = findViewById(R.id.textViewCode);
        tvModName = findViewById(R.id.textViewModName);
        tvAcadYear = findViewById(R.id.textViewAcadYear);
        tvSem = findViewById(R.id.textViewSem);
        tvModCred = findViewById(R.id.textViewModCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        //Getting the Intent from MainActivity
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("ModuleCode");
        String modName = intentReceived.getStringExtra("ModuleName");
        int acadYear = intentReceived.getIntExtra("AcademicYear",2019);
        int sem = intentReceived.getIntExtra("Semester",1);
        int modCred = intentReceived.getIntExtra("ModuleCredit",4);
        String venue = intentReceived.getStringExtra("Venue");


        tvCode.setText("Module code : " + code);
        tvModName.setText("Module name : " + modName);
        tvAcadYear.setText("Academic Year : " + acadYear);
        tvSem.setText("Semester : " + sem);
        tvModCred.setText("Module Credit : " + modCred);
        tvVenue.setText("Venue : " + venue);



    }
}
