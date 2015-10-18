package com.letseat.letseat;
import android.os.AsyncTask;

import com.letseat.letseat.YelpAPI;

class SearchYelp extends AsyncTask<String, Void, String> {

    private Exception exception;

    protected String doInBackground(String... urls) {
        try {
            YelpAPI.testMe();
            System.out.println("xxyy4");

        } catch (Exception e) {
            this.exception = e;
            System.out.println("xxyyERROR");
            System.out.println(e);

            return null;

        }
        return null;
    }

    protected void onPostExecuted() {
        // TODO: check this.exception
        // TODO: do something with the feed
    }
}