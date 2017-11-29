package om.gov.ita.fragment.hcthome;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import om.gov.ita.fragment.R;

/**
 * Created by sasmob on 11/28/2017.
 */

public class HCTHomeAdapter extends RecyclerView.Adapter<HCTHomeAdapter.ViewHolder> {
    Context mContext;
    ArrayList<HomeItems> homeItems;
    HomeItems items;
    public onAdapterItemClick onItemClick;
    public interface  onAdapterItemClick{
        public void onItemClick(int position);
    }

    public HCTHomeAdapter(Context mContext, ArrayList<HomeItems> homeItems) {
        this.mContext = mContext;
        this.homeItems = homeItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.home_list_item,parent,false);
        return  new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(HCTHomeAdapter.ViewHolder holder, final int position) {
        items=homeItems.get(position);
        holder.homeimage.setImageResource(items.getHomeImages());
        holder.homeitems.setText(items.getHomeItems());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   onItemClick.onItemClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return homeItems.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView homeitems;
        ImageView homeimage;
        public  ViewHolder(View itemView){
            super(itemView);
           homeimage=(ImageView) itemView.findViewById(R.id.homeimage);
           homeitems=(TextView) itemView.findViewById(R.id.hometext);
        }
    }
    public void setOnIemClick (onAdapterItemClick onIemClick){
        this.onItemClick=onItemClick;
    }
}
