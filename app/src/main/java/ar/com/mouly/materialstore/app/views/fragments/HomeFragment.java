package ar.com.mouly.materialstore.app.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ar.com.mouly.materialstore.app.R;
import ar.com.mouly.materialstore.app.views.adapters.HomeListAdapter;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * @author amouly on 5/2/15.
 */
public class HomeFragment extends Fragment {

    @InjectView(R.id.home_list) RecyclerView recyclerView;

    private RecyclerView.Adapter listAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private final String[] dataSet = new String[]{ "Decorative Pillows", "Test 2", "Test 3" };

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        ButterKnife.inject(this, root);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        listAdapter = new HomeListAdapter(getActivity(), dataSet);
        recyclerView.setAdapter(listAdapter);

        return root;
    }
}
