package sg.edu.rp.c346.mymodules;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,ModuleInfo.class);
                intent1.putExtra("ModuleCode","C346");
                intent1.putExtra("ModuleName","Android Programming");
                intent1.putExtra("AcademicYear","2019");
                intent1.putExtra("Semester","1");
                intent1.putExtra("ModuleCredit","4");
                intent1.putExtra("Venue","W66M");
                startActivity(intent1);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,ModuleInfo.class);
                intent2.putExtra("ModuleCode","C349");
                intent2.putExtra("ModuleName","iPad Programming");
                intent2.putExtra("AcademicYear","2019");
                intent2.putExtra("Semester","1");
                intent2.putExtra("ModuleCredit","4");
                intent2.putExtra("Venue","W65M");
                startActivity(intent2);
            }
        });

    }
}
