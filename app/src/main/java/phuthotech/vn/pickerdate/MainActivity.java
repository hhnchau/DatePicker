package phuthotech.vn.pickerdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDatePicker myDatePicker = findViewById(R.id.myPicker);
        MyDatePicker myDatePicker1 = findViewById(R.id.myPicker1);
        MyDatePicker myDatePicker2 = findViewById(R.id.myPicker2);

        String[] PLANETS = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Pluto"};
        myDatePicker.setOffset(3);
        myDatePicker.setSelection(3);
        myDatePicker.setItems(Arrays.asList(PLANETS));
        myDatePicker1.setItems(Arrays.asList(PLANETS));
        myDatePicker2.setItems(Arrays.asList(PLANETS));


        myDatePicker.setOnWheelViewListener(new MyDatePicker.OnWheelViewListener(){
            @Override
            void onSelected(int selectedIndex, String item) {
                super.onSelected(selectedIndex, item);

                Toast.makeText(MainActivity.this, item + selectedIndex, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
