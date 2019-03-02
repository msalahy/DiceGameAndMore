
package innerclass;

public class Button {
    private String title;
    private OnClickListener onClickLister;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void setOnClickListener(OnClickListener OnClickListener){
        this.onClickLister = OnClickListener;
    }
    
    public interface OnClickListener{
        public void onClick(String titel);
    }
    
}
