package adapter;

import java.util.Iterator;
import java.util.StringTokenizer;

public class TokenizerToIteratorAdapter implements Iterator<String> {

    private StringTokenizer st;

    public TokenizerToIteratorAdapter(StringTokenizer st) {
        this.st = st;
    }

    @Override
    public boolean hasNext() {
        return st.hasMoreTokens();
    }

    @Override
    public String next() {
        return st.nextToken();
    }
}
