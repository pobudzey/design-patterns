package observer;

public class Client {

    public static void main(String[] args) {
        Follower f1 = new Follower("Maxim");
        Follower f2 = new Follower("Gleb");
        TwitterAccount a1 = new TwitterAccount();
        f1.follow(a1);
        f2.follow(a1);
        a1.tweet("My first tweet");
        f1.getFeed();
        f2.getFeed();
        a1.tweet("My second tweet");
        f1.getFeed();
        f2.getFeed();
    }

}
