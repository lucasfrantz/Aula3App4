package com.lucasf.aula3app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById( R.id.btnCalculate );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView totalConsumption = findViewById( R.id.editTotalComsumption );
                TextView couvert = findViewById( R.id.editArtistic );
                TextView divideBy = findViewById( R.id.editDivide );
                //TextView meses = findViewById( R.id.txtTempo );

                try {

                    Double valorTotalConsumption = Double.valueOf( totalConsumption.getText().toString());
                    Double valorCouvert = Double.valueOf( couvert.getText().toString());
                    Double numPeople = Double.valueOf( divideBy.getText().toString());

                    Double soma = valorTotalConsumption + valorCouvert;
                    Double taxa = soma * 0.1;
                    Double total = soma + taxa;
                    Double perPerson = total/numPeople;

                    TextView txtTotal = findViewById(R.id.editTotal );
                    TextView txtTaxa = findViewById(R.id.editService );
                    TextView txtPerPerson = findViewById(R.id.editShare );

                    txtTotal.setText( String.valueOf( total ) );
                    txtTaxa.setText( String.valueOf( taxa ) );
                    txtPerPerson.setText( String.valueOf( perPerson ) );
                }
                catch( Exception ex )
                {
                    //Toast.makeText( MainActivity.this, getString(R.string.warning), Toast.LENGTH_LONG );
                }
            }
        });
    }
}