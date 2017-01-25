package binaryconverter.jfd01020.vtc.binaryconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        vBin = (TextView)findViewById(R.id.binDisplay);
        //vBin.setText("");
        vDec = (TextView)findViewById(R.id.decDisplay);
        //vDec.setText("0");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zeroClicked(View button0){
        bin = bin+"0";
        vBin.setText(bin);
    }

    public void oneClicked(View button1){
        bin = bin+"1";
        vBin.setText(bin);
    }

    public void clear(View buttonC){

    }

    private String bin="";
    private String dec;
    private TextView vBin;
    private TextView vDec;
}
