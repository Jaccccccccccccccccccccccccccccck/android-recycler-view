package com.ahmadrosid.searchrecyclerview.presenter;

import android.support.v7.widget.RecyclerView;

public interface MainView {
    /**
     * Set RecyclerView for result search hotel
     * @param adapter
     */
    void setRV(RecyclerView.Adapter adapter);

    /**
     * Set visibility progress bar
     * @param visibility
     */
    void setVisibilityProgressBar(int visibility);
}
