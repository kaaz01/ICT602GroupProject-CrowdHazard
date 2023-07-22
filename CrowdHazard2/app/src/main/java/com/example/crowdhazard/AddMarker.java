package com.example.crowdhazard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class AddMarker extends AppCompatActivity {

    EditText etName, hazardType, etloc, etdesc, etlat, etlng;
    RequestQueue queue;
    final String URL = "http://192.168.0.11/crowds/api.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_marker);

        this.setTitle("Add Marker");

        queue = Volley.newRequestQueue(getApplicationContext());

        etName = (EditText) findViewById(R.id.etName);
        hazardType = (EditText) findViewById(R.id.hazardType);
        etloc = (EditText) findViewById(R.id.etloc);
        etdesc = (EditText) findViewById(R.id.etdesc);
        etlat = (EditText) findViewById(R.id.etlat);
        etlng = (EditText) findViewById(R.id.etlng);
        Button button = (Button) findViewById(R.id.btnSubmit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //volley call
                makeRequest();
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void makeRequest() {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Marker Added", Toast.LENGTH_SHORT).show();
            }
        }, errorListener) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("name", etName.getText().toString());
                params.put("hazard_type", hazardType.getText().toString());
                params.put("hazard_loc", etloc.getText().toString());
                params.put("hazard_desc", etdesc.getText().toString());
                params.put("hazard_lat", etlat.getText().toString());
                params.put("hazard_long", etlng.getText().toString());

                return params;
            }
        };
        queue.add(stringRequest);
    }

    public Response.ErrorListener errorListener = new Response.ErrorListener() {

        @Override
        public void onErrorResponse(VolleyError error) {

        }
    };

}