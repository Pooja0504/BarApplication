package pooja.jadhav.barapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menubar, menu);
        setContentView(R.layout.activity_main);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.camera:
                camera();
                return true;
            case R.id.settings:
                setting();
                return true;
            case R.id.gallery:
                gallery();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void gallery() {
        Intent intent=new Intent(MainActivity.this,GalleryActivity.class);
        startActivity(intent);
    }

    private void setting() {
        Intent intent=new Intent(MainActivity.this,SettingsActivity.class);
        startActivity(intent);
    }

    private void camera() {
        Intent intent=new Intent(MainActivity.this,CameraActivity.class);
        startActivity(intent);
    }
}
