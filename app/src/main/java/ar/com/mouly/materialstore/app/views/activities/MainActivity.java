package ar.com.mouly.materialstore.app.views.activities;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import ar.com.mouly.materialstore.app.R;
import ar.com.mouly.materialstore.app.views.fragments.HomeFragment;
import ar.com.mouly.materialstore.common.Constants;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * @author amouly on 3/29/15.
 */
public class MainActivity extends AppCompatActivity implements Drawer.OnDrawerItemClickListener {

    @InjectView(R.id.toolbar_main) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        setSupportActionBar(toolbar);

        // Init Drawer
        Drawer.Result result = new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.drawer_item_home),
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem().withName(R.string.drawer_item_settings)
                )
                .withOnDrawerItemClickListener(this)
                .build();

        // Set default section
        result.setSelectionByIdentifier(1);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {
        // Open sections
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, HomeFragment.newInstance())
                .addToBackStack(null)
                .commit();
    }
}
