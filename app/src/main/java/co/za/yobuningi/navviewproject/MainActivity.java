package co.za.yobuningi.navviewproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);

        ActionBarDrawerToggle toggle =
                new ActionBarDrawerToggle(this, drawer, toolbar,
                        R.string.navigation_drawer_open,
                        R.string.navigation_drawer_close);

        if (drawer != null) {
            drawer.addDrawerListener(toggle);
        }
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        switch(item.getItemId()){
            case R.id.nav_camera:
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Camera Button Pressed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_gallery:
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Gallery Button Pressed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_slideshow:
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Slideshow Button Pressed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_manage:
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Tools Button Pressed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_share:
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Share Button Pressed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_send:
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Send Button Pressed", Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return false;
        }
    }
}
