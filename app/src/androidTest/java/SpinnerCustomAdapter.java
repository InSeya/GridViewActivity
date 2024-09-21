
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
public class SpinnerCustomAdapter extends BaseAdapter {
    Context context;
    String name[];
    int img[];
    LayoutInflater inflater;

    public SpinnerCustomAdapter(Context context,String name) {
    }

    @Override
    public int getCount() {
        return 0;
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
        return null;
    }
}
