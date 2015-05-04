package ar.com.mouly.materialstore.app.views.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import ar.com.mouly.materialstore.app.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * @author amouly on 5/2/15.
 */
public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHolder> {

    private String[] itemsList;
    private Context context;

    // Provide a suitable constructor (depends on the kind of dataset)
    public HomeListAdapter(Context context, String[] myDataset) {
        this.context = context;
        this.itemsList = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public HomeListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_home_list, parent, false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Get element from your dataset at this position
        holder.title.setText(itemsList[position]);
        holder.price.setText("$55.00");
        holder.priceType.setText("reg");

        Picasso.with(context)
                .load("http://www.samplestore.io/v/vspfiles/photos/ah-decorpillows-2T.jpg")
                .resize(180, 180)
                .centerCrop()
                .into(holder.imageView);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsList.length;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @InjectView(R.id.home_item_title)       TextView title;
        @InjectView(R.id.home_item_price)       TextView price;
        @InjectView(R.id.home_item_price_type)  TextView priceType;
        @InjectView(R.id.home_item_image)       ImageView imageView;

        public ViewHolder(View container) {
            super(container);

            ButterKnife.inject(this, container);
        }
    }
}