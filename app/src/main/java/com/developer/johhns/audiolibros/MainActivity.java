package com.developer.johhns.audiolibros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Application;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

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

        aplicacion.getAdaptador().setOnItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Seleccionastes el elemento : " + recView.getChildAdapterPosition(v) ,Snackbar.LENGTH_LONG).show();
            }
        });

        layoutManager = new LinearLayoutManager( this ) ;
        //layoutManager = new GridLayoutManager( this ,2 ) ;
        //layoutManager = new GridLayoutManager( this ,2 , LinearLayoutManager.HORIZONTAL,false) ;

        recView.setLayoutManager( layoutManager );
    }
}