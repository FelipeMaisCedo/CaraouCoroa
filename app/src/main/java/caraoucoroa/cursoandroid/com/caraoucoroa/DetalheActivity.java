package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private static final String CARA = "cara";
    private static final String COROA = "coroa";

    private ImageView botaoVoltar;
    private ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);
        moeda = (ImageView) findViewById(R.id.moedaId);

        Bundle opcoes = getIntent().getExtras();
        String opcao = opcoes.getString("opcao");

        if(!opcoes.isEmpty()){
            if(opcao.equalsIgnoreCase(CARA)){
                moeda.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.moeda_cara));
            }else if (opcao.equalsIgnoreCase(COROA)){
                moeda.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.moeda_coroa));
            }
        }

        voltar();
    }

    private void voltar(){
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
            }
        });
    }
}
