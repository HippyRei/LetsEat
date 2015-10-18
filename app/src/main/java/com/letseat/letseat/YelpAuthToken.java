package com.letseat.letseat;

/**
 * Created by BrendanKing on 10/18/15.
 */
public class YelpAuthToken {


    private String consumerKey;
    private String consumerSecret;
    private String token;
    private String tokenSecret;

    //Single Instance for the class
    private YelpAuthToken mytoken = new YelpAuthToken();

    /*
   Constructs an object with the 4 token parameters for Yelp Authorization
   */
    private YelpAuthToken() {
        //Eventually implement this so valid keys are pushed to firebase and read here
        consumerKey = "Gx0UEg24aKdOEsAIstAE5Q";
        consumerSecret = "f5yqTzM25e2TAAVT4-PB1FzjxoI";
        token = "Sl6bkTxXCe9aKzA48YQ0VzEKw3xnKB7U";
        tokenSecret = "9uQnQ9NoinH0MCSDymHtzuwWLck";
    }

    /*
     Returns a YelpAuthToken for use with the YelpAPI
     */
    public YelpAuthToken getToken() {

        return mytoken;
    }
}
/*
Gx0UEg24aKdOEsAIstAE5Q
Consumer Secret	f5yqTzM25e2TAAVT4-PB1FzjxoI
Token	Sl6bkTxXCe9aKzA48YQ0VzEKw3xnKB7U
Token Secret	9uQnQ9NoinH0MCSDymHtzuwWLck
 */