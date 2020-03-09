package observer;

import java.util.ArrayList;

public class Follower implements Observer {

    private ArrayList<TwitterAccount> accounts = new ArrayList<>();
    private String accountName;
    private ArrayList<String> feed = new ArrayList<>();

    public Follower(String accountName) {
        this.accountName = accountName;
    }

    public void follow(TwitterAccount account) {
        accounts.add(account);
        account.addObserver(this);
    }

    public void unfollow(TwitterAccount account) {
        accounts.remove(account);
        account.removeObserver(this);
    }

    @Override
    public void update(Observable observable) {
        feed.add(((TwitterAccount)observable).getLastTweet());
    }

    public void getFeed() {
        System.out.println("Twitter feed of " + getAccountName() + ":");
        for (String tweet: feed) {
            System.out.println(tweet);
        }
    }

    public String getAccountName() {
        return accountName;
    }
}
