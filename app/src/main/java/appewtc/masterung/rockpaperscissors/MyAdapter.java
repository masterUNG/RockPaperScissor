package appewtc.masterung.rockpaperscissors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by masterUNG on 12/18/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private String[] dateStrings, scoreStrings;

    public MyAdapter(Context objContext, String[] dateStrings, String[] scoreStrings) {
        this.objContext = objContext;
        this.dateStrings = dateStrings;
        this.scoreStrings = scoreStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return dateStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.score_listview, viewGroup, false);



        return null;
    }
}   // Main Class
