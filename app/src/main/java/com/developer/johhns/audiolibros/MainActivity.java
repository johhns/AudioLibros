package com.developer.johhns.audiolibros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Application;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView ;
    private RecyclerView.LayoutManager layoutManager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aplicacion aplicacion = (Aplicacion) getApplication() ;
        recView = (RecyclerView) findViewById( R.id.recView01 ) ;
        recView.setAdapter( aplicacion.getAdaptador() );
        layoutManager = new LinearLayoutManager( this ) ;
        recView.setLayoutManager( layoutManager );
    }
}