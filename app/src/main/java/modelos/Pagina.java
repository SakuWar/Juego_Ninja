package modelos;

public class Pagina {
    private int mImageId;
    private String mText;
    private Opcion mOpcion1;
    private Opcion mOpcion2;
    private boolean mIsFinal=false;

    public Pagina(int ImageId, String Text, Opcion Opcion1, Opcion Opcion2) {
        mImageId = ImageId;
        mText = Text;
        mOpcion1 = Opcion1;
        mOpcion2 = Opcion2;
    }
    public boolean isFinal()
    {
        return mIsFinal;
    }
    public void setIsFinal(boolean isFinal ) {
        mIsFinal=isFinal;
    }

    public Pagina(int ImageId,String Text)
    {
        mImageId = ImageId;
        mText = Text;
        mOpcion1 = null;
        mOpcion2 = null;
        mIsFinal=true;

    }

    public Pagina(int ImageId, String Text, Opcion Opcion1) {
        mImageId = ImageId;
        mText = Text;
        mOpcion1 = Opcion1;
        mOpcion2 = null;
        mIsFinal = true; // Marcar como página final
    }


    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int ImageId) {
        mImageId = ImageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String Text) {
        mText = Text;
    }

    public Opcion getOpcion1() {
        return mOpcion1;
    }

    public void setOpcion1(Opcion Opcion1) {
        mOpcion1 = Opcion1;
    }

    public Opcion getOpcion2() {
        return mOpcion2;
    }

    public void setOpcion2(Opcion Opcion2) {
        mOpcion2 = Opcion2;
    }

}
