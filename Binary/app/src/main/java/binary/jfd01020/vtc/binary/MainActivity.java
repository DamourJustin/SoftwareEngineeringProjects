package binary.jfd01020.vtc.binary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vDec = (TextView)findViewById(R.id.decDisplay);
        vBin = (TextView)findViewById(R.id.binDisplay);


    }

    public void zeroClicked(View button0){
        if(!bin.equals("0")) {
            bin = bin + "0";
            vBin.setText(bin);
            vDec.setText("" + Integer.parseInt(bin, 2));
        }
    }

    public void oneClicked(View button1){
        if(bin.equals("0")){
            bin="1";
            vBin.setText(bin);
            vDec.setText("" + Integer.parseInt(bin, 2));
        }else {
            bin = bin + "1";
            vBin.setText(bin);
            vDec.setText("" + Integer.parseInt(bin, 2));
        }
    }

    public void clear(View buttonC){
        bin="";
        vBin.setText(bin);
        vDec.setText("0");
    }




    private String bin = "";
    private int dec;
    private TextView vDec;
    private TextView vBin;
}
