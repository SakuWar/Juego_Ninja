package modelos;

public class Opcion {
    private String mText;
    private int mNextPage;

    public Opcion(String text, int nextPage) {
        this.mText = text;
        this.mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public int getNextPage() {
        return mNextPage;
    }
}

