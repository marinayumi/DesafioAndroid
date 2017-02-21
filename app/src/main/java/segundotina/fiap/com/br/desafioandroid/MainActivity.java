package segundotina.fiap.com.br.desafioandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgAleatoria;
    private int[] play = {
            R.drawable.cachorro,
            R.drawable.leao,
            R.drawable.panda,
            R.drawable.raposa,
            R.drawable.tucano
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAleatoria = (ImageView) findViewById(R.id.imgAleatoria);
    }

    public void escolher (View v){
        Random r = new Random();

        int aleatorio = r.nextInt(5);

        imgAleatoria.setImageResource(play[aleatorio]);
    }
}
