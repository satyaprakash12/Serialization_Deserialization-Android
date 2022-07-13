package meity.gov.in.jsoninandoid;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson=new Gson();
        Model model=new Model("satya","satyaprakas5555@gmail.com",32);
        //Serialization
        String json=gson.toJson(model);
        Log.d(TAG,json);

         //Deserialization
        String data=  "{\"Email\":\"satyaprakas5555@gmail.com\",\"Name\":\"satya\",\"age\":32}";
        Model model1=gson.fromJson(data,Model.class);
        Log.d(TAG,model1.toString());

    }

}